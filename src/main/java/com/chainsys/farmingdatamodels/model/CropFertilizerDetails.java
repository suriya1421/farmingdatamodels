package com.chainsys.farmingdatamodels.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cropfertilizerdetails")
public class CropFertilizerDetails {
	@Id
	@Column(name="crop_id")
	private int cropId;
	@Column(name="fer_id")
	private int fertilizerId;
	@Column(name="quantity")
	private String quantity;
	@Column(name="stage_of_use")
	private String stageOfUse;
	
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
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getStageOfUse() {
		return stageOfUse;
	}
	public void setStageOfUse(String stageOfUse) {
		this.stageOfUse = stageOfUse;
	}
	

	
}
