package com.chainsys.farmingdatamodels.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.chainsys.farmingdatamodels.model.CropDetails;
import com.chainsys.farmingdatamodels.model.UserDetails;
import com.chainsys.farmingdatamodels.services.CropDetailsService;
import com.chainsys.farmingdatamodels.services.UserDetailsService;

@Controller
@RequestMapping("/home")
public class HomeController {
	@Autowired
	UserDetailsService userDetailsService;
	@Autowired
	private CropDetailsService cropdetailsService;
	
	@GetMapping("/userlogin")
	public String adminaccessform(Model model) {
	    UserDetails  userDetails  = new UserDetails();
	    model.addAttribute("user", userDetails);
	    return "User";
	}                   

	@PostMapping("/checkuserlogin")
	public String checkingAccess(@ModelAttribute("user") UserDetails user) {
		UserDetails userDetails =userDetailsService.getUserByUserNameAndPassword(user.getUserName(),user.getPassword());
	    if (userDetails!= null){

	        return "redirect:/home/search";
	    } else
	        return "invalid-user-error";

	}
	@GetMapping("/search")
	public String searchCrop(Model model) {
		List<CropDetails>croplist=cropdetailsService.getCropDetailsRepository();
		CropDetails cropDetails=new CropDetails();
		model.addAttribute("croplist", croplist);
		model.addAttribute("cropDetails", cropDetails);
	    return "searchcrop";
	}  
	@PostMapping("/button")
	public String button(@ModelAttribute("cropDetails")CropDetails cropDetails,Model model) {
	    model.addAttribute("cropId", cropDetails.getCropId());
	    CropDetails cropDetail=cropdetailsService.findById(cropDetails.getCropId());
	    model.addAttribute("cropDetails", cropDetail);
	    model.addAttribute("cropDetailsDiscription", cropDetail.getDescription());
	    model.addAttribute("cropid",cropDetail.getCropId());
	    model.addAttribute("cropName", cropDetail.getCropName());
	    model.addAttribute("duration", cropDetail.getDuration());
	    return "buttons";
	} 
	
	@GetMapping("/homepage1")
	public String first1(Model model) {
	    
	    return "Home";
	}  
	
	@GetMapping("/index")
	public String index(Model model) {
	    
	    return "index2";
	}
	   
	@GetMapping("/login")
	public String userSignupPageToLogin(Model model) {
	    
	    return "redirect_signup_to_signin";
	}
	   
	 
	
}
