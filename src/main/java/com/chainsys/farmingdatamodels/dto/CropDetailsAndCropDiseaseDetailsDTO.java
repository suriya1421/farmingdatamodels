package com.chainsys.farmingdatamodels.dto;

import java.util.ArrayList;
import java.util.List;

import com.chainsys.farmingdatamodels.model.CropDetails;
import com.chainsys.farmingdatamodels.model.CropDiseaseDetails;

public class CropDetailsAndCropDiseaseDetailsDTO {
	private CropDetails cropDetails;
	private List<CropDiseaseDetails> cropDiseaseDetails=new ArrayList<>();
	public CropDetails getCropDetails() {
		return cropDetails;
	}
	public void setCropDetails(CropDetails cropDetails) {
		this.cropDetails = cropDetails;
	}

	public List<CropDiseaseDetails> getCropDiseaseDetails() {
		return cropDiseaseDetails;
	}
	public void addCropDiseaseDetails(List<CropDiseaseDetails> cropDiseaseDetails) {
		this.cropDiseaseDetails=cropDiseaseDetails;
	}
	 
	 
}
