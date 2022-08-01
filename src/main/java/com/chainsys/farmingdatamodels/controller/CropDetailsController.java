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

import com.chainsys.farmingdatamodels.pojo.CropDetails;
import com.chainsys.farmingdatamodels.pojo.Disease;
import com.chainsys.farmingdatamodels.pojo.Fertilizer;
import com.chainsys.farmingdatamodels.services.CropDetailsService;

@Controller
@RequestMapping("/cropdetail")
public class CropDetailsController {
	@Autowired
	CropDetailsService crop;
	
	@GetMapping("/list")
	public String getFindAll(Model model) {
		List<CropDetails> cr = crop.getCrop();
		model.addAttribute("allcrop", cr);
		return "viewall_Crops";

}
	@GetMapping("/addform")
	public String showAddForm(Model model) {
		CropDetails cr = new CropDetails();
		model.addAttribute("addcropdetails", cr);
		return "add_crop_form";
	}

	@PostMapping("/add")
	public String addNewcrop(@ModelAttribute("addcropdetails") CropDetails cr) {
		crop.save(cr);
		return "redirect:/cropdetail/list";

	}
	@GetMapping("/updateform")
	public String showUpdateForm(@RequestParam("update") int id, Model model) {
		CropDetails cr = crop.findById(id);
		model.addAttribute("updatecrop", cr);
		return "update_crop_form";
	}

	@PostMapping("/update")
	public String UpdateCrop(@ModelAttribute("updatecrop") CropDetails cr) {
		crop.save(cr);
		return "redirect:/cropdetail/list";
	}
	@GetMapping("/delete")
	public String deleteCrop(@RequestParam("id") int id) {
		crop.deleteById(id);
		return "redirect:/cropdetail/list";

	}
	@GetMapping("/getcrop")
	public String getCrop(@RequestParam("id") int id, Model model) {
    CropDetails cr= crop.findById(id);
		model.addAttribute("findcropbyid", cr);
		return "find_crop_by_id";
	}
}
