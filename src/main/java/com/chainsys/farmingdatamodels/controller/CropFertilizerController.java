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
import com.chainsys.farmingdatamodels.model.CropFertilizerDetails;
import com.chainsys.farmingdatamodels.model.Disease;
import com.chainsys.farmingdatamodels.services.CropFertilizerService;

@Controller
@RequestMapping("/cropfertilizer")
public class CropFertilizerController {
@Autowired
CropFertilizerService crfe;
@GetMapping("/allcropfertilizerlist")
public String getFindAll(Model model) {
	List<CropFertilizerDetails> crf = crfe.getCropFertilizer();
	model.addAttribute("cropFertilizer", crf);
	return "viewall_crop_fertilizer";

}
@GetMapping("/addquantityandstage")
public String showAddForm(Model model) {
	CropFertilizerDetails dis = new CropFertilizerDetails();
	model.addAttribute("addcropfertilizer", dis);
	return "add_crop_fertilizer_form";
}

@PostMapping("/add")
public String addNewFertilizerDetail(@ModelAttribute("addcropfertilizer") CropFertilizerDetails crfertilizer) {
	crfe.save(crfertilizer);
	return "redirect:/cropfertilizer/allcropfertilizerlist";

}
@GetMapping("/updatequantityandstage")
public String showUpdateForm(@RequestParam("id") int id, Model model) {
	CropFertilizerDetails crfer = crfe.findById(id);
	model.addAttribute("updatecropfertilizer", crfer);
	return "update_cropfertilizer_form";
}

@PostMapping("/update")
public String UpdateCrop(@ModelAttribute("updatecropfertilizer") 	CropFertilizerDetails cr) {
	crfe.save(cr);
	return "redirect:/cropfertilizer/allcropfertilizerlist";
}
@GetMapping("/deletequantityandstage")
public String deleteCropFertilizer(@RequestParam("id") int id) {
	crfe.deleteById(id);
	return "redirect:/cropfertilizer/allcropfertilizerlist";

}
@GetMapping("/getquantityandstagebyid")
public String getCropFertilizer(@RequestParam("id") int id, Model model) {
	CropFertilizerDetails crf= crfe.findById(id);
	model.addAttribute("findcropfertilizerbyid", crf);
	return "find_crop_fertilizer_by_id";
}
}