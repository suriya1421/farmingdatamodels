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

import com.chainsys.farmingdatamodels.dto.FertilizerAndFertilizerDetailsDTO;
import com.chainsys.farmingdatamodels.model.Fertilizer;
import com.chainsys.farmingdatamodels.services.FertilizerService;

@Controller
@RequestMapping("/fertilizer")
public class FertilizerController {
	@Autowired
	FertilizerService fertilizerService;
	public static final String ADDFERTILIZER = "add_fertilizer_form";
	public static final String LISTOFFERTILIZER= "redirect:/fertilizer/allfertilizerlist";
	public static final String UPDATEFERTILIZER = "update_fertilizer_form";

	@GetMapping("/allfertilizerlist")
	public String getFindAll(Model model) {
		List<Fertilizer> fertilizer = fertilizerService.getFertilizer();
		model.addAttribute("allfertilizer", fertilizer);
		return "viewall_fertilizer";
	}

	@GetMapping("/addfertilizer")
	public String showAddForm(Model model) {
		Fertilizer fertilizer = new Fertilizer();
		model.addAttribute("addfertilizer", fertilizer);
		return ADDFERTILIZER;
	}

	@PostMapping("/add")
	public String addNewFertilizerDetail(@ModelAttribute("addfertilizer") Fertilizer fe) {
		fertilizerService.save(fe);
		return LISTOFFERTILIZER;

	}

	@GetMapping("/updatefertilizer")
	public String showUpdateForm(@RequestParam("id") int id, Model model) {
		Fertilizer fertilizer = fertilizerService.findById(id);
		model.addAttribute("updatefertilizer", fertilizer);
		return UPDATEFERTILIZER;
	}

	@PostMapping("/update")
	public String updateFertilizer(@ModelAttribute("updatecrop") Fertilizer fertilizer) {
		fertilizerService.save(fertilizer);
		return LISTOFFERTILIZER;
	}

	@GetMapping("/deletefertilizer")
	public String deleteFertilizer(@RequestParam("id") int id) {
		fertilizerService.deleteById(id);
		return LISTOFFERTILIZER;

	}

	@GetMapping("/getfertilizer")
	public String getFertilizer(@RequestParam("id") int id, Model model) {
		Fertilizer fertilizer= fertilizerService.findById(id);
		model.addAttribute("findfertilizerbyid", fertilizer);
		return "find_fertilizer_by_id";
	}
	@GetMapping("/getfertilizeridbyfertilizer")
	public String getfertilizeridbyfertilizer(@RequestParam("id") int id, Model model) {
		FertilizerAndFertilizerDetailsDTO fertilizerAndFertilizerDetailsDTO	=fertilizerService.getFertilizerAndFertilizerDetails(id);
		model.addAttribute("getFertilizer",fertilizerAndFertilizerDetailsDTO.getFertilizer());
		model.addAttribute("getFertilizerAndFertilizerDetails", fertilizerAndFertilizerDetailsDTO.getFertilizerAndFertilizerDetails());
		return "find_fertilizer_by_fertilizer_id";
	}

}
