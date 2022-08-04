package com.chainsys.farmingdatamodels.dto;

import java.util.ArrayList;
import java.util.List;

import com.chainsys.farmingdatamodels.model.CropDiseaseDetails;
import com.chainsys.farmingdatamodels.model.Disease;

public class DiseaseAndDiseaseDetailsDTO {
	private Disease  disease;
	 private List<CropDiseaseDetails> cropDiseaseDetails=new ArrayList<CropDiseaseDetails>();
	 
 public Disease getDisease() {
		return disease;
	}
	public void setDisease(Disease disease) {
		this.disease = disease;
	}
	public List<CropDiseaseDetails> getCropDiseaseDetails() {
		return cropDiseaseDetails;
	}
	public void addCropDiseaseDetails(CropDiseaseDetails cropDiseaseDetail) {
		cropDiseaseDetails.add(cropDiseaseDetail);
	}

}
