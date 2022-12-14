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
	public static final String ADDADMIN="add-admin-login-form";
	public static final String LISTADMIN="redirect:/admin/adminlist";
	public static final String UPDATEADMIN="update-admin-login-form";

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
		return ADDADMIN;
	}

	@PostMapping("/addnewadminlogin")
	public String addNewAdminLogin(@ModelAttribute("addadminlogin") Admin admin) {
		adminService.save(admin);
		return LISTADMIN;
	}

	@GetMapping("/updateadminloginform")
	public String showUpdateAdminLoginForm(@RequestParam("adminid") int adminid, Model model) {
		Admin adminlogin = adminService.findById(adminid);
		model.addAttribute("updateadminlogin", adminlogin);
		return UPDATEADMIN;
	}

	@PostMapping("/updatenewadminlogin")
	public String updateNewAdminLogin(@ModelAttribute("updateadminlogin") Admin admin) {
		adminService.save(admin);
		return LISTADMIN;
	}

	@GetMapping("deleteadminlogin")
	public String deleteAdminLogin(@RequestParam("adminid") int adminid) {
		adminService.deleteById(adminid);
		return LISTADMIN;
	}

	@GetMapping("/loginform")
	public String adminLoginForm(Model model) {
		Admin admin = new Admin();
		model.addAttribute("adminlogin", admin);
		return "admin_login_form";
	}

	@PostMapping("/checkadminlogin")
	public String checkingAccess(@ModelAttribute("adminlogin") Admin aDmin,Model model) {
		Admin admin = adminService.getEmailAndPassword(aDmin.getEmail(),
				aDmin.getPassword());
		if (admin != null) {
			return "redirect:/home/index";
		} else {
			model.addAttribute("result","password and UserName Mismatch");
	        return "admin_login_form";
		}

	}

}
