package com.chainsys.farmingdatamodels.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cropdetails")
public class CropDetails {
	@Id
	@Column(name="crop_id")
	private int cropId;
	@Column(name="crop_name")
	private String cropName;
	@Column(name="description")
	private String description;
	@Column(name="duration")
	private int duration;
	
	public int getCropId() {
		return cropId;
	}
	public void setCropId(int cropId) {
		this.cropId = cropId;
	}
	public String getCropName() {
		return cropName;
	}
	public void setCropName(String cropName) {
		this.cropName = cropName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	

	
}
