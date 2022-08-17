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

import com.chainsys.farmingdatamodels.dto.CropDetailsAndCropDiseaseDetailsDTO;
import com.chainsys.farmingdatamodels.dto.CropFertilizerDetailsDTO;
import com.chainsys.farmingdatamodels.model.CropDetails;
import com.chainsys.farmingdatamodels.services.CropDetailsService;

@Controller
@RequestMapping("/cropdetails")
public class CropDetailsController {
	@Autowired
	CropDetailsService cropDetailsService;
	private static final String ADDCROPFORM="add_crop_form";
	private static final String ADDCROPLIST="redirect:/cropdetails/croplist";
	private static final String UPDATECROP="update_crop_form";
	
	
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
		return ADDCROPFORM;
	}

	@PostMapping("/add")
	public String addNewcrop(@ModelAttribute("addcropdetails") CropDetails  cropDetails) {
		cropDetailsService.save( cropDetails);
		return ADDCROPLIST;

	}
	@GetMapping("/updatecrop")
	public String showUpdateForm(@RequestParam("id") int id, Model model) {
		CropDetails  cropDetails = cropDetailsService.findById(id);
		model.addAttribute("updatecrop",  cropDetails);
		return UPDATECROP;
	}

	@PostMapping("/update")
	public String updateCrop(@ModelAttribute("updatecrop") CropDetails  cropDetails) {
		cropDetailsService.save( cropDetails);
		return ADDCROPLIST;
	}
	@GetMapping("/deletecrop")
	public String deleteCrop(@RequestParam("id") int id) {
		cropDetailsService.deleteById(id);
		return ADDCROPLIST;

	}
	@GetMapping("/getcropbyid")
	public String getCrop(@RequestParam("cropId") int id, Model model) {
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
	@GetMapping("/getcropidbydisease")
	public String getCropIdByDisease(@RequestParam("id") int id, Model model) {
		CropDetailsAndCropDiseaseDetailsDTO cropDetailsAndCropDiseaseDetailsDTO=cropDetailsService.getCropAndDiseaseDetails(id);
		model.addAttribute("getcropid",cropDetailsAndCropDiseaseDetailsDTO.getCropDetails());
		model.addAttribute("returndiseasedetails",cropDetailsAndCropDiseaseDetailsDTO.getCropDiseaseDetails());
		return "list_crop_disease_details";
	}
}
