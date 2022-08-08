package com.chainsys.farmingdatamodels.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.chainsys.farmingdatamodels.model.Admin;
import com.chainsys.farmingdatamodels.services.AdminService;

@Controller
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	private AdminService adminService;

	@GetMapping("/adminlist")
	public String getAllAdminLogin(Model model) {
		List<Admin> adminlogin = adminService.getAdminLogin();
		model.addAttribute("alladmin", adminlogin);
		return "list-admin-login";
	}

	@GetMapping("/getadminloginbyid")
	public String getAdminLoginId(@RequestParam("adminid") int adminid, Model model) {
		Admin adminlogin = adminService.findById(adminid);
		model.addAttribute("getadminlogin", adminlogin);
		return "find-admin-login-by-id";
	}

	@GetMapping("/addadminloginform")
	public String showAdminLoginForm(Model model) {
		Admin admin = new Admin();
		model.addAttribute("addadminlogin", admin);
		return "add-admin-login-form";
	}

	@PostMapping("/addnewadminlogin")
	public String addNewAdminLogin(@ModelAttribute("addadminlogin") Admin admin) {
		adminService.save(admin);
		return "redirect:/admin/adminlist";
	}

	@GetMapping("/updateadminloginform")
	public String showUpdateAdminLoginForm(@RequestParam("adminid") int adminid, Model model) {
		Admin adminlogin = adminService.findById(adminid);
		model.addAttribute("updateadminlogin", adminlogin);
		return "update-admin-login-form";
	}

	@PostMapping("/updatenewadminlogin")
	public String updateNewAdminLogin(@ModelAttribute("updateadminlogin") Admin admin) {
		adminService.save(admin);
		return "redirect:/admin/adminlist";
	}

	@GetMapping("deleteadminlogin")
	public String deleteAdminLogin(@RequestParam("adminid") int adminid) {
		adminService.deleteById(adminid);
		return "redirect:/admin/adminlist";
	}

	@GetMapping("/loginform")
	public String adminLoginForm(Model model) {
		Admin admin = new Admin();
		model.addAttribute("adminlogin", admin);
		return "admin_login_form";
	}

	@PostMapping("/checkadminlogin")
	public String checkingAccess(@ModelAttribute("adminlogin") Admin aDmin) {
		Admin admin = adminService.getAdminIdAndEmailAndPassword(aDmin.getAdminId(), aDmin.getEmail(),
				aDmin.getPassword());
		if (admin != null) {
			return "redirect:/admin/adminlist";
		} else {
			return "redirect-adminloginpage";
		}

	}

}
