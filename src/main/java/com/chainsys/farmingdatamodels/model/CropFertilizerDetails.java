package com.chainsys.farmingdatamodels.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.chainsys.farmingdatamodels.compositekey.FertilizerDetailsCompositeKey;

@Entity
@Table(name="cropfertilizerdetails")
@IdClass(FertilizerDetailsCompositeKey.class)
public class CropFertilizerDetails {
	@Id
	@Column(name="crop_id")
	private int cropId;
	@Id
	@Column(name="fer_id")
	private int fertilizerId;
	@Column(name="quantity")
	private String quantity;
	@Column(name="stage_of_use")
	private String stageOfUse;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="crop_id",nullable = false,insertable = false,updatable = false)
	
	
	private CropDetails  cropDetails;
	public CropDetails getCropDetails() {
		return cropDetails;
	}
	public void setCropDetails(CropDetails cropDetails) {
		this.cropDetails = cropDetails;
	}
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="fer_id",nullable = false,insertable = false,updatable = false)
	private Fertilizer fertilizer;
	
	
	public Fertilizer getFertilizer() {
		return fertilizer;
	}
	public void setFertilizer(Fertilizer fertilizer) {
		this.fertilizer = fertilizer;
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
