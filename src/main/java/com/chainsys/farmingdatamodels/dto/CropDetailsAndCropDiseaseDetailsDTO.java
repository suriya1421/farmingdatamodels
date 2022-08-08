package com.chainsys.farmingdatamodels.dto;

import java.util.ArrayList;
import java.util.List;

import com.chainsys.farmingdatamodels.model.CropDetails;
import com.chainsys.farmingdatamodels.model.CropDiseaseDetails;
import com.chainsys.farmingdatamodels.model.CropFertilizerDetails;

public class CropDetailsAndCropDiseaseDetailsDTO {
	private CropDetails cropDetails;
	private List<CropDiseaseDetails> CropDiseaseDetails=new ArrayList<CropDiseaseDetails>();
	public CropDetails getCropDetails() {
		return cropDetails;
	}
	public void setCropDetails(CropDetails cropDetails) {
		this.cropDetails = cropDetails;
	}

	public List<CropDiseaseDetails> getCropDiseaseDetails() {
		return CropDiseaseDetails;
	}
	public void addCropDiseaseDetails(List<CropDiseaseDetails> cropDiseaseDetails) {
		this.CropDiseaseDetails=cropDiseaseDetails;
	}
	 
	 
}
