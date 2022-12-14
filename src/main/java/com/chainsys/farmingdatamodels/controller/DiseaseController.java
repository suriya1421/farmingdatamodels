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

import com.chainsys.farmingdatamodels.dto.DiseaseAndDiseaseDetailsDTO;
import com.chainsys.farmingdatamodels.model.Disease;
import com.chainsys.farmingdatamodels.services.DiseaseService;

@Controller
@RequestMapping("/disease")
public class DiseaseController {
	@Autowired
	DiseaseService diseaseService;
	public static final String ADDDISEASE = "add_disease_form";
	public static final String LISTOFDISEASE = "redirect:/disease/alldiseaselist";
	public static final String UPDATEDISEASE = "update_disease_form";

	@GetMapping("/alldiseaselist")
	public String getFindAll(Model model) {
		List<Disease> disease = diseaseService.getDisease();
		model.addAttribute("allDisease", disease);
		return "viewall_Disease";
	}

	@GetMapping("/addnewdisease")
	public String showAddForm(Model model) {
		Disease disease = new Disease();
		model.addAttribute("adddisease", disease);
		return ADDDISEASE;
	}

	@PostMapping("/add")
	public String addNewFertilizerDetail(@ModelAttribute("adddisease") Disease disease) {
		diseaseService.save(disease);
		return LISTOFDISEASE;

	}

	@GetMapping("/updatedisease")
	public String showUpdateForm(@RequestParam("update") int id, Model model) {
		Disease disease = diseaseService.findById(id);
		model.addAttribute("updatedisease", disease);
		return UPDATEDISEASE;
	}

	@PostMapping("/update")
	public String updateFertilizer(@ModelAttribute("updatedisease") Disease disease) {
			System.out.println("somthing");
			diseaseService.save(disease);
		return LISTOFDISEASE;
	}

	@GetMapping("/deletedisease")
	public String deleteDisease(@RequestParam("id") int id) {
		diseaseService.deleteById(id);
		return LISTOFDISEASE;

	}

	@GetMapping("/getdiseasefindbyid")
	public String getDisease(@RequestParam("disease") Disease disease, Model model) {
		model.addAttribute("finddiseasebyid", disease);
		return "find_disease_by_id";
	}

	@GetMapping("/getcropdiseasebydiseaseid")
	public String getCropDiseaseByDiseaseId(@RequestParam("id") int id, Model model) {
		DiseaseAndDiseaseDetailsDTO diseaseAndDiseaseDetailsDTO = diseaseService.getCropDiseaseDetails(id);
		model.addAttribute("getdiseasebyid", diseaseAndDiseaseDetailsDTO.getDisease());
		model.addAttribute("returndiseasedetails", diseaseAndDiseaseDetailsDTO.getCropDiseaseDetails());
		return "list_disease_by_disease_id";
	}

}
