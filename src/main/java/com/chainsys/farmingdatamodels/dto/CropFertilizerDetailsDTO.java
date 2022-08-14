package com.chainsys.farmingdatamodels.dto;

import java.util.ArrayList;
import java.util.List;

import com.chainsys.farmingdatamodels.model.CropDetails;
import com.chainsys.farmingdatamodels.model.CropFertilizerDetails;

public class CropFertilizerDetailsDTO {
	private CropDetails cropDetails;
	private List<CropFertilizerDetails> cropFertilizerDetails=new ArrayList<>();
	public CropDetails getCropDetails() {
		return cropDetails;
	}
	public void setCropDetails(CropDetails cropDetails) {
		this.cropDetails = cropDetails;
	}
	public List<CropFertilizerDetails> getCropFertilizerDetails() {
		return cropFertilizerDetails;
	}
	
	public void addcropFertilizerDetails(CropFertilizerDetails cropFertilizerDetail) {
		cropFertilizerDetails.add(cropFertilizerDetail);
	}
	

}
