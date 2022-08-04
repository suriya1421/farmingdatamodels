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

import com.chainsys.farmingdatamodels.dto.CropFertilizerDetailsDTO;
import com.chainsys.farmingdatamodels.model.CropDetails;
import com.chainsys.farmingdatamodels.model.Disease;
import com.chainsys.farmingdatamodels.model.Fertilizer;
import com.chainsys.farmingdatamodels.services.CropDetailsService;

@Controller
@RequestMapping("/cropdetails")
public class CropDetailsController {
	@Autowired
	CropDetailsService cropDetailsService;
	
	@GetMapping("/croplist")
	public String getFindAll(Model model) {
		List<CropDetails> cropDetails = cropDetailsService.getCropDetailsRepository();
		model.addAttribute("allcrop", cropDetails);
		return "viewall_Crops";

}
	@GetMapping("/addcrop")
	public String showAddForm(Model model) {
		CropDetails  cropDetails = new CropDetails();
		model.addAttribute("addcropdetails",  cropDetails);
		return "add_crop_form";
	}

	@PostMapping("/add")
	public String addNewcrop(@ModelAttribute("addcropdetails") CropDetails  cropDetails) {
		cropDetailsService.save( cropDetails);
		return "redirect:/cropdetails/croplist";

	}
	@GetMapping("/updatecrop")
	public String showUpdateForm(@RequestParam("id") int id, Model model) {
		CropDetails  cropDetails = cropDetailsService.findById(id);
		model.addAttribute("updatecrop",  cropDetails);
		return "update_crop_form";
	}

	@PostMapping("/update")
	public String UpdateCrop(@ModelAttribute("updatecrop") CropDetails  cropDetails) {
		cropDetailsService.save( cropDetails);
		return "redirect:/cropdetails/croplist";
	}
	@GetMapping("/deletecrop")
	public String deleteCrop(@RequestParam("id") int id) {
		cropDetailsService.deleteById(id);
		return "redirect:/cropdetails/croplist";

	}
	@GetMapping("/getcropbyid")
	public String getCrop(@RequestParam("id") int id, Model model) {
    CropDetails cropDetails= cropDetailsService.findById(id);
		model.addAttribute("findcropbyid",  cropDetails);
		return "find_crop_by_id";
	}
	@GetMapping("/getcropidbyfertilizer")
	public String getCropIdByFertilizer(@RequestParam("id") int id, Model model) {
		CropFertilizerDetailsDTO cropFertilizerDetailsDTO=cropDetailsService.getCropAndFertilizerDetails(id);
		model.addAttribute("getcropid",cropFertilizerDetailsDTO.getCropDetails());
		model.addAttribute("returnfertilizerdetails",cropFertilizerDetailsDTO.getCropFertilizerDetails());
		return "list_crop_fertilizer_details";
	}
}
