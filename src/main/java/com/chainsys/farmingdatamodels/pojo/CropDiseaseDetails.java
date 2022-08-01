package com.chainsys.farmingdatamodels.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cropdiseasedetails")
public class CropDiseaseDetails {
	@Id
	private int crop_id;
	private int disease_id;
	private String affecting_stages;

	public int getCrop_id() {
		return crop_id;
	}

	public void setCrop_id(int crop_id) {
		this.crop_id = crop_id;
	}

	public int getDisease_id() {
		return disease_id;
	}

	public void setDisease_id(int disease_id) {
		this.disease_id = disease_id;
	}

	public String getAffecting_stages() {
		return affecting_stages;
	}

	public void setAffecting_stages(String affecting_stages) {
		this.affecting_stages = affecting_stages;
	}

}
