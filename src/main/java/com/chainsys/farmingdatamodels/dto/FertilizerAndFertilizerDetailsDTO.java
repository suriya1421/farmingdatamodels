package com.chainsys.farmingdatamodels.dto;

import java.util.ArrayList;
import java.util.List;

import com.chainsys.farmingdatamodels.model.CropFertilizerDetails;
import com.chainsys.farmingdatamodels.model.Fertilizer;

public class FertilizerAndFertilizerDetailsDTO {
 private Fertilizer fertilizer ;
 private List<CropFertilizerDetails> cropFertilizerDetails=new ArrayList<CropFertilizerDetails>();
 public Fertilizer getFertilizer() {
	return fertilizer;
}
public void setFertilizer(Fertilizer fertilizer) {
	this.fertilizer = fertilizer;
}
public List<CropFertilizerDetails> getFertilizerAndFertilizerDetails() {
	return cropFertilizerDetails;
}
public void addFertilizerDetails(CropFertilizerDetails cropFertilizerDetail) {
	cropFertilizerDetails.add(cropFertilizerDetail);
}
 
}
