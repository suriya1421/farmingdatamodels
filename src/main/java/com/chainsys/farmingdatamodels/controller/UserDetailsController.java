package com.chainsys.farmingdatamodels.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
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
UserDetailsService userDetailsService;
@GetMapping("/alluserlist")
public String getFindAll(Model model) {
	List<UserDetails> userDetails=userDetailsService.getUser();
	model.addAttribute("alluser", userDetails);
	return "viewalluser";
	}
@GetMapping("/addnewuser")
public String showAddForm(Model model) {
	UserDetails userDetails=new UserDetails();
	model.addAttribute("adduserdetail", userDetails);
	return "add_userdetail_form";
}
@PostMapping("/add")
public String addNewUserDetail(@Valid @ModelAttribute("adduserdetail")UserDetails userDetails,Errors errors) {
	if(errors.hasErrors()) {
		return "add_userdetail_form";
	}
	
		userDetailsService.save(userDetails);
	return "redirect:/home/login";
}
@GetMapping("/updateuser")
public String showUpdateForm(@RequestParam("update") int id, Model model ){
    UserDetails userDetails=userDetailsService.findById(id);
    model.addAttribute("updateuser", userDetails);
    return "update_userdetail_form";
}

@PostMapping("/update")
public String updateuser(@Valid@ModelAttribute("updateuser") UserDetails userDetails,Errors errors) {
	if(errors.hasErrors()) {
		return "update_userdetail_form";
	}
	else {
		userDetailsService.save(userDetails);
	return "redirect:/user/alluserlist";
	}
	
}
@GetMapping("/deleteuser")
public String deleteUser(@RequestParam("id") int id) {
	userDetailsService.deleteById(id);
	return "redirect:/user/alluserlist";
	
}
@GetMapping("/getuserfindbyid")
public String getUser(@RequestParam("id") int id,Model model)
{
    UserDetails userDetails=userDetailsService.findById(id);
    model.addAttribute("finduserbyid",userDetails);
    return "find_user_by_id";
}
}
