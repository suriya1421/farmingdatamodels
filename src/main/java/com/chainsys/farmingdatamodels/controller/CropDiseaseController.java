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

import com.chainsys.farmingdatamodels.model.CropDiseaseDetails;
import com.chainsys.farmingdatamodels.model.Disease;
import com.chainsys.farmingdatamodels.services.CropDiseaseService;

@Controller
@RequestMapping("/cropdisease")
public class CropDiseaseController {
	@Autowired
	CropDiseaseService cropDiseaseService;

	@GetMapping("/viewallcropdiseaselist")
	public String getFindAll(Model model) {
		List<CropDiseaseDetails> cropDiseaseDetails = cropDiseaseService.getCropDisease();
		model.addAttribute("allcropDisease", cropDiseaseDetails);
		return "viewall_crop_disease";
	}
	@GetMapping("/addaffectionstage")
	public String showAddForm(Model model) {
		CropDiseaseDetails cropDiseaseDetails = new CropDiseaseDetails();
		model.addAttribute("addcropdisease", cropDiseaseDetails);
		return "add_cropdisease_form";
	}

	@PostMapping("/add")
	public String addNewCropDisease(@ModelAttribute("addcropdisease") CropDiseaseDetails cropDiseaseDetails) {
		cropDiseaseService.save(cropDiseaseDetails);
		return "redirect:/cropdisease/viewallcropdiseaselist";

	}
	@GetMapping("/updateaffectingstage")
	public String showUpdateForm(@RequestParam("id") int id, Model model) {
		CropDiseaseDetails cropDiseaseDetails = cropDiseaseService.findById(id);
		model.addAttribute("updatecropdisease", cropDiseaseDetails);
		return "update_cropdisease_form";
	}

	@PostMapping("/update")
	public String UpdateCrop(@ModelAttribute("updatecropdisease") 	CropDiseaseDetails cropDiseaseDetails) {
		cropDiseaseService.save(cropDiseaseDetails);
		return "redirect:/cropdisease/viewallcropdiseaselist";
	}
	@GetMapping("/deleteaffectingstage")
	public String deleteCropDisease(@RequestParam("id") int id) {
		cropDiseaseService.deleteById(id);
		return "redirect:/cropdisease/viewallcropdiseaselist";

	}
	@GetMapping("/getaffectingstagebyid")
	public String getCropDisease(@RequestParam("id") int id, Model model) {
		CropDiseaseDetails cropDiseaseDetails= cropDiseaseService.findById(id);
		model.addAttribute("findCropdiseasebyid", cropDiseaseDetails);
		return "find_cropdisease_by_id";
	}
	
}
