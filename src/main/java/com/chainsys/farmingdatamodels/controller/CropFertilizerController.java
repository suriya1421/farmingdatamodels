package com.chainsys.farmingdatamodels.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.chainsys.farmingdatamodels.compositekey.FertilizerDetailsCompositeKey;
import com.chainsys.farmingdatamodels.model.CropFertilizerDetails;
import com.chainsys.farmingdatamodels.model.Fertilizer;
import com.chainsys.farmingdatamodels.services.CropFertilizerService;
import com.chainsys.farmingdatamodels.services.FertilizerService;

@Controller
@RequestMapping("/cropfertilizer")
public class CropFertilizerController {
	@Autowired
	CropFertilizerService cropFertilizerService;
	@Autowired
	private FertilizerService fertilizerService;
	public static final String ADDCROPFERTILIZER = "add_crop_fertilizer_form";
	public static final String LISTCROPFERTILIZER = "redirect:/cropfertilizer/allcropfertilizerlist";
	public static final String UPDATECROPFERTILIZER = "update_cropfertilizer_form";

	@GetMapping("/allcropfertilizerlist")
	public String getFindAll(Model model) {
		List<CropFertilizerDetails> cropFertilizerDetails = cropFertilizerService.getCropFertilizer();
		model.addAttribute("cropFertilizer", cropFertilizerDetails);
		return "viewall_crop_fertilizer";

	}

	@GetMapping("/addquantityandstage")
	public String showAddForm(Model model) {
		CropFertilizerDetails cropFertilizerDetails = new CropFertilizerDetails();
		model.addAttribute("addcropfertilizer", cropFertilizerDetails);
		return ADDCROPFERTILIZER;
	}

	@PostMapping("/add")
	public String addNewFertilizerDetail(
			@ModelAttribute("addcropfertilizer") CropFertilizerDetails cropFertilizerDetails) {
		cropFertilizerService.save(cropFertilizerDetails);
		return LISTCROPFERTILIZER;

	}

	@GetMapping("/updatequantityandstage")
	public String showUpdateForm(@RequestParam("id") int id, @RequestParam("fertilizerId") int fertilizerId,
			Model model) {
		FertilizerDetailsCompositeKey fertilizerDetailsCompositeKey = new FertilizerDetailsCompositeKey(id,
				fertilizerId);
		Optional<CropFertilizerDetails> cropFertilizerDetails = cropFertilizerService
				.findById(fertilizerDetailsCompositeKey);
		model.addAttribute("updatecropfertilizer", cropFertilizerDetails);
		return UPDATECROPFERTILIZER;
	}

	@PostMapping("/update")
	public String updateCrop(@ModelAttribute("updatecropfertilizer") CropFertilizerDetails cropFertilizerDetails) {
		cropFertilizerService.save(cropFertilizerDetails);
		return LISTCROPFERTILIZER;
	}

	@GetMapping("/deletequantityandstage")
	public String deleteCropFertilizer(@RequestParam("id") int id, @RequestParam("fertilizerId") int fertilizerId) {
		FertilizerDetailsCompositeKey fertilizerDetailsCompositeKey = new FertilizerDetailsCompositeKey(id,
				fertilizerId);
		cropFertilizerService.deleteById(fertilizerDetailsCompositeKey);
		return LISTCROPFERTILIZER;

	}

	@GetMapping("/getCropFertilizer")
	public String getCropFertilizerByCropId(@RequestParam("cropid") int id, Model model) {
		List<CropFertilizerDetails> cropFertilizerDetailslist = cropFertilizerService
				.getCropFertilizerDetailsByCropId(id);
		model.addAttribute("cropFertilizerDetailslist", cropFertilizerDetailslist);
		List<Fertilizer> fertilizerList = new ArrayList<>();
		for (int i = 0; i < cropFertilizerDetailslist.size(); i++) {
			CropFertilizerDetails cropFertilizerDetails = cropFertilizerDetailslist.get(i);
			Fertilizer fertilizer = fertilizerService.findById(cropFertilizerDetails.getFertilizerId());
			fertilizerList.add(fertilizer);
		}
		model.addAttribute("fertilizerList", fertilizerList);
		return "list-crop-fertilizer-cropId";
	}

	@GetMapping("/getquantityandstagebyid")
	public String getCropFertilizer(@RequestParam("id") int id, @RequestParam("fertilizerId") int fertilizerId,
			Model model) {
		FertilizerDetailsCompositeKey fertilizerDetailsCompositeKey = new FertilizerDetailsCompositeKey(id,
				fertilizerId);
		Optional<CropFertilizerDetails> cropFertilizerDetails = cropFertilizerService
				.findById(fertilizerDetailsCompositeKey);
		model.addAttribute("findcropfertilizerbyid", cropFertilizerDetails);
		return "find_crop_fertilizer_by_id";
	}

}