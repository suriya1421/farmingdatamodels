package com.chainsys.farmingdatamodels.compositekey;

import java.io.Serializable;

import javax.persistence.Column;

public class FertilizerDetailsCompositeKey implements Serializable {
	@Column(name="fer_id")
	private int fertilizerId;
	@Column(name="crop_id")
	private int cropId;
	public FertilizerDetailsCompositeKey() {
		
	}
	
	public FertilizerDetailsCompositeKey(int  cropId,int fertilizerId) {
		this.cropId=cropId;
		this.fertilizerId=fertilizerId;
	}
	public int getCropId() {
		return cropId;
	}
	public void setCropId(int cropId) {
		this.cropId = cropId;
	}
	public int getFertilizerId() {
		return fertilizerId;
	}
	public void setFertilizerId(int fertilizerId) {
		this.fertilizerId = fertilizerId;
	}
	
	

}
