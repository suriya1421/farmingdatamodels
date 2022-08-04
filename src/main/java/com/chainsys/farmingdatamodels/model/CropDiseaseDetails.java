package com.chainsys.farmingdatamodels.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.chainsys.farmingdatamodels.compositekey.DiseaseDetailsCompositeKey;

@Entity
@Table(name="cropdiseasedetails")
@IdClass(DiseaseDetailsCompositeKey.class)
public class CropDiseaseDetails {
	@Id
	@Column(name="crop_id")
	private int cropId;
	@Id
	@Column(name="disease_id")
	private int diseaseId;
	@Column(name="affecting_stages")
	private String affectingStages;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="disease_id", nullable=false,insertable=false,updatable=false)
	
	private Disease  disease ;
	public Disease getDisease() {
		return disease;
	}
	public void setDisease(Disease disease) {
		this.disease = disease;
	}
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
