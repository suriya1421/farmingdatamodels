package com.chainsys.farmingdatamodels.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cropdiseasedetails")
public class CropDiseaseDetails {
	@Id
	@Column(name="crop_id")
	private int cropId;
	@Column(name="disease_id")
	private int diseaseId;
	@Column(name="affecting_stages")
	private String affectingStages;
	
	public int getCropId() {
		return cropId;
	}
	public void setCropId(int cropId) {
		this.cropId = cropId;
	}
	public int getDiseaseId() {
		return diseaseId;
	}
	public void setDiseaseId(int diseaseId) {
		this.diseaseId = diseaseId;
	}
	public String getAffectingStages() {
		return affectingStages;
	}
	public void setAffectingStages(String affectingStages) {
		this.affectingStages = affectingStages;
	}
	

	
}
