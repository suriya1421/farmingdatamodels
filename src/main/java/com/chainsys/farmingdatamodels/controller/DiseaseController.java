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

import com.chainsys.farmingdatamodels.model.Disease;
import com.chainsys.farmingdatamodels.model.Fertilizer;
import com.chainsys.farmingdatamodels.services.DiseaseService;

@Controller
@RequestMapping("/disease")
public class DiseaseController {
	@Autowired
	DiseaseService disease;
	
	@GetMapping("/alldiseaselist")
	public String getFindAll(Model model) {
		List<Disease> dis = disease.getDisease();
		model.addAttribute("allDisease", dis);
		return "viewall_Disease";
	}
	@GetMapping("/addnewdisease")
	public String showAddForm(Model model) {
		Disease dis = new Disease();
		model.addAttribute("adddisease", dis);
		return "add_disease_form";
	}

	@PostMapping("/add")
	public String addNewFertilizerDetail(@ModelAttribute("adddisease") Disease dis) {
		disease.save(dis);
		return "redirect:/disease/alldiseaselist";

	}
	@GetMapping("/updatedisease")
	public String showUpdateForm(@RequestParam("update") int id, Model model) {
		Disease dis = disease.findById(id);
		model.addAttribute("updatedisease", dis);
		return "update_disease_form";
	}

	@PostMapping("/update")
	public String UpdateFertilizer(@ModelAttribute("updatedisease") Disease dis) {
		disease.save(dis);
		return "redirect:/disease/list";
	}
	@GetMapping("/deletedisease")
	public String deleteDisease(@RequestParam("id") int id) {
		disease.deleteById(id);
		return "redirect:/disease/alldiseaselist";

	}

	@GetMapping("/getdiseasefindbyid")
	public String getDisease(@RequestParam("id") int id, Model model) {
		Disease dis= disease.findById(id);
		model.addAttribute("finddiseasebyid", dis);
		return "find_disease_by_id";
	}
	


	

}
