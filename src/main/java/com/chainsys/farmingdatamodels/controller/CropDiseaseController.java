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

import com.chainsys.farmingdatamodels.compositekey.DiseaseDetailsCompositeKey;
import com.chainsys.farmingdatamodels.model.CropDiseaseDetails;
import com.chainsys.farmingdatamodels.model.Disease;
import com.chainsys.farmingdatamodels.services.CropDiseaseService;
import com.chainsys.farmingdatamodels.services.DiseaseService;

@Controller
@RequestMapping("/cropdisease")
public class CropDiseaseController {
	@Autowired
	CropDiseaseService cropDiseaseService;
	@Autowired
	DiseaseService diseaseService;
	public static final String ADDCROPDISEASE="add_cropdisease_form";
	public static final String LISTCROPDISEASE="redirect:/cropdisease/viewallcropdiseaselist";
	public static final String UPDATECROPDISEASE="update_cropdisease_form";


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
		return ADDCROPDISEASE;
	}

	@PostMapping("/add")
	public String addNewCropDisease(@ModelAttribute("addcropdisease") CropDiseaseDetails cropDiseaseDetails) {
		cropDiseaseService.save(cropDiseaseDetails);
		return LISTCROPDISEASE;

	}

	@GetMapping("/updateaffectingstage")
	public String showUpdateForm(@RequestParam("id") int id, @RequestParam("diseaseId") int diseaseId,Model model) {
		DiseaseDetailsCompositeKey diseaseDetailsCompositeKey = new DiseaseDetailsCompositeKey(diseaseId, id);
		Optional<CropDiseaseDetails> cropDiseaseDetails = cropDiseaseService.findById(diseaseDetailsCompositeKey);
		model.addAttribute("updatecropdisease", cropDiseaseDetails);
		return UPDATECROPDISEASE;
	}

	@PostMapping("/update")
	public String updateCrop(@ModelAttribute("updatecropdisease") CropDiseaseDetails cropDiseaseDetails) {
		cropDiseaseService.save(cropDiseaseDetails);
		return LISTCROPDISEASE;
	}

	@GetMapping("/deleteaffectingstage")
	public String deleteCropDisease(@RequestParam("id") int id, @RequestParam("diseaseId") int diseaseId) {
		DiseaseDetailsCompositeKey diseaseDetailsCompositeKey=new DiseaseDetailsCompositeKey(diseaseId,id);
		cropDiseaseService.deleteById(diseaseDetailsCompositeKey);
		return LISTCROPDISEASE;

	}
	@GetMapping("/getcropdiseasebycropid")
	public String getCropDisease(@RequestParam("disease")int id,Model model) {
		 List<CropDiseaseDetails>cropDiseaseList=cropDiseaseService.getCropDiseaseDetailsByCropId(id);
		    model.addAttribute("cropDiseaseList", cropDiseaseList);
		return "list-crop-disease-cropId";
	}

	@GetMapping("/getaffectingstagebyid")
	public String getCropDisease(@RequestParam("diseaseid") int id, @RequestParam("cropId") int diseaseId, Model model) {
		DiseaseDetailsCompositeKey diseaseDetailsCompositeKey = new DiseaseDetailsCompositeKey(id, diseaseId);
		Optional<CropDiseaseDetails> cropDiseaseDetails = cropDiseaseService.findById(diseaseDetailsCompositeKey);
		model.addAttribute("findCropdiseasebyid", cropDiseaseDetails);
		return "find_cropdisease_by_id";
	}
	@GetMapping("/getCropDisease")
	public String getCropDiseaseByCropId(@RequestParam("cropid")int id, Model model) {
		List<CropDiseaseDetails>cropDiseaseDetailslist=cropDiseaseService.getCropDiseaseDetailsByCropId(id);
	    model.addAttribute("cropDiseaseDetailslist", cropDiseaseDetailslist);
	    List<Disease> diseaselist=new ArrayList<>();
	    for(int i=0;i<cropDiseaseDetailslist.size();i++){
	    	CropDiseaseDetails cropDiseaseDetails=cropDiseaseDetailslist.get(i);
	    	Disease disease=diseaseService.findById(cropDiseaseDetails.getDiseaseId());
	    	diseaselist.add(disease);
	    }
	    model.addAttribute("diseaseList", diseaselist);
	    return "list_crop_disease_cropId";
	}

}
