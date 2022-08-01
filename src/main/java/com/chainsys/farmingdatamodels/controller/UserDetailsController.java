package com.chainsys.farmingdatamodels.controller;

import java.util.List;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.chainsys.farmingdatamodels.model.UserDetails;
import com.chainsys.farmingdatamodels.services.UserDetailsService;


@Controller
@RequestMapping("/user")
public class UserDetailsController {
@Autowired
UserDetailsService user;
@GetMapping("/alluserlist")
public String getFindAll(Model model) {
	List<UserDetails> listuser=user.getUser();
	model.addAttribute("alluser", listuser);
	return "viewalluser";
	}
@GetMapping("/addnewuser")
public String showAddForm(Model model) {
	UserDetails ud=new UserDetails();
	model.addAttribute("adduserdetail", ud);
	return "add_userdetail_form";
}
@PostMapping("/add")
public String addNewUserDetail(@ModelAttribute("adduserdetail")UserDetails ud) {
	user.save(ud);
	return "redirect:/user/list";
	
}
@GetMapping("/updateuser")
public String showUpdateForm(@RequestParam("update") int id, Model model ){
    UserDetails br=user.findById(id);
    model.addAttribute("updateuser", br);
    return "update_userdetail_form";
}

@PostMapping("/update")
public String Updateuser(@ModelAttribute("updateuser") UserDetails ud) {
    user.save(ud);
    return "redirect:/user/list";
}
@GetMapping("/deleteuser")
public String deleteUser(@RequestParam("id") int id) {
	user.deleteById(id);
	return "redirect:/user/list";
	
}
@GetMapping("/getuserfindbyid")
public String getUser(@RequestParam("id") int id,Model model)
{
    UserDetails userid=user.findById(id);
    model.addAttribute("finduserbyid",userid);
    return "find_user_by_id";
}
}
