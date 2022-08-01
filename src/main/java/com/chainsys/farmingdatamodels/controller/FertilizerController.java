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

import com.chainsys.farmingdatamodels.model.Fertilizer;
import com.chainsys.farmingdatamodels.services.FertilizerService;

@Controller
@RequestMapping("/fertilizer")
public class FertilizerController {
	@Autowired
	FertilizerService fertilizer;

	@GetMapping("/allfertilizerlist")
	public String getFindAll(Model model) {
		List<Fertilizer> fe = fertilizer.getFertilizer();
		model.addAttribute("allfertilizer", fe);
		return "viewall_fertilizer";
	}

	@GetMapping("/addfertilizer")
	public String showAddForm(Model model) {
		Fertilizer fe = new Fertilizer();
		model.addAttribute("addfertilizer", fe);
		return "add_fertilizer_form";
	}

	@PostMapping("/add")
	public String addNewFertilizerDetail(@ModelAttribute("addfertilizer") Fertilizer fe) {
		fertilizer.save(fe);
		return "redirect:/fertilizer/allfertilizerlist";

	}

	@GetMapping("/updatefertilizer")
	public String showUpdateForm(@RequestParam("id") int id, Model model) {
		Fertilizer fe = fertilizer.findById(id);
		model.addAttribute("updatefertilizer", fe);
		return "update_fertilizer_form";
	}

	@PostMapping("/update")
	public String UpdateFertilizer(@ModelAttribute("updatecrop") Fertilizer fe) {
		fertilizer.save(fe);
		return "redirect:/fertilizer/allfertilizerlist";
	}

	@GetMapping("/deletefertilizer")
	public String deleteFertilizer(@RequestParam("id") int id) {
		fertilizer.deleteById(id);
		return "redirect:/fertilizer/list";

	}

	@GetMapping("/getfertilizer")
	public String getFertilizer(@RequestParam("id") int id, Model model) {
		Fertilizer fe= fertilizer.findById(id);
		model.addAttribute("findfertilizerbyid", fe);
		return "find_fertilizer_by_id";
	}

}
