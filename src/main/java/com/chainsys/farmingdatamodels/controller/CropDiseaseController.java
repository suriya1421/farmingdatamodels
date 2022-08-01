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

import com.chainsys.farmingdatamodels.pojo.CropDiseaseDetails;
import com.chainsys.farmingdatamodels.pojo.Disease;
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
	@GetMapping("/updateform")
	public String showUpdateForm(@RequestParam("id") int id, Model model) {
		CropDiseaseDetails crdisease = crdis.findById(id);
		model.addAttribute("updatecropdisease", crdisease);
		return "update_cropdisease_form";
	}

	@PostMapping("/update")
	public String UpdateCrop(@ModelAttribute("updatecropdisease") 	CropDiseaseDetails cr) {
		crdis.save(cr);
		return "redirect:/cropdisease/list";
	}
	@GetMapping("/delete")
	public String deleteCropDisease(@RequestParam("id") int id) {
		crdis.deleteById(id);
		return "redirect:/cropdisease/list";

	}
	@GetMapping("/getcropdisease")
	public String getCropDisease(@RequestParam("id") int id, Model model) {
		CropDiseaseDetails dis= crdis.findById(id);
		model.addAttribute("findCropdiseasebyid", dis);
		return "find_cropdisease_by_id";
	}
	
}
