package com.chainsys.farmingdatamodels.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.chainsys.farmingdatamodels.model.UserDetails;
import com.chainsys.farmingdatamodels.services.UserDetailsService;

@Controller
@RequestMapping("/home")
public class HomeController {
	@Autowired
	UserDetailsService userDetailsService;

	@GetMapping("/userlogin")
	public String adminaccessform(Model model) {
	    UserDetails  userDetails  = new UserDetails();
	    model.addAttribute("user", userDetails);
	    return "user_login_form";
	}                   

	@PostMapping("/checkuserlogin")
	public String checkingAccess(@ModelAttribute("user") UserDetails user) {
		UserDetails userDetails =userDetailsService.getUserByUserNameAndPassword(user.getUserName(),user.getPassword());
	    if (userDetails!= null){

	        return "redirect:/home/search";
	    } else
	        return "invalid-customer-error";

	}
	@GetMapping("/search")
	public String searchCrop(Model model) {
	    
	    return "searchcrop";
	}  
	@GetMapping("/button")
	public String button(Model model) {
	    
	    return "buttons";
	}  
	@GetMapping("/firstpage")
	public String first(Model model) {
	    
	    return "firstpage";
	}  
}
