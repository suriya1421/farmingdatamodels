package com.chainsys.farmingdatamodels.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CropDetailsIndex {
@GetMapping ("/index")
public String indexPage() {
	return "index";
	
}
}
