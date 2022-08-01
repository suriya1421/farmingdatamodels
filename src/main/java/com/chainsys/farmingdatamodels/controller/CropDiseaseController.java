package com.chainsys.farmingdatamodels.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.chainsys.farmingdatamodels.pojo.CropDiseaseDetails;
import com.chainsys.farmingdatamodels.services.CropDiseaseService;

@Controller
@RequestMapping("/cropdisease")
public class CropDiseaseController {
	@Autowired
	CropDiseaseService crdis;

	@GetMapping("/list")
	public String getFindAll(Model model) {
		List<CropDiseaseDetails> dis = crdis.getCropDisease();
		model.addAttribute("allcropDisease", dis);
		return "viewall_crop_disease";
	}
	@GetMapping("/addform")
	public String showAddForm(Model model) {
		CropDiseaseDetails dis = new CropDiseaseDetails();
		model.addAttribute("addcropdisease", dis);
		return "add_cropdisease_form";
	}

	@PostMapping("/add")
	public String addNewCropDisease(@ModelAttribute("addcropdisease") CropDiseaseDetails crodis) {
		crdis.save(crodis);
		return "redirect:/cropdisease/list";

	}
}
