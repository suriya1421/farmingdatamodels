package com.chainsys.farmingdatamodels.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Disease {
	@Id
	@Column(name = "disease_id")
	private int diseaseId;
	@Column(name = "disease_name")
	private String diseaseName;
	@Column(name = "reason")
	private String reason;
	@Column(name = "medicine")
	private String medicine;
	@Column(name = "prevention")
	private String prevention;

	public int getDiseaseId() {
		return diseaseId;
	}

	public void setDiseaseId(int diseaseId) {
		this.diseaseId = diseaseId;
	}

	public String getDiseaseName() {
		return diseaseName;
	}

	public void setDiseaseName(String diseaseName) {
		this.diseaseName = diseaseName;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getMedicine() {
		return medicine;
	}

	public void setMedicine(String medicine) {
		this.medicine = medicine;
	}

	public String getPrevention() {
		return prevention;
	}

	public void setPrevention(String prevention) {
		this.prevention = prevention;
	}

}
