package com.chainsys.farmingdatamodels.compositekey;

import java.io.Serializable;

import javax.persistence.Column;

public class DiseaseDetailsCompositeKey implements Serializable {
	@Column(name = "disease_id")
	private int diseaseId;
	@Column(name = "crop_id")
	private int cropId;

	public DiseaseDetailsCompositeKey() {

	}

	public DiseaseDetailsCompositeKey(int diseaseId, int cropId) {
		this.cropId = cropId;
		this.diseaseId = diseaseId;
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

}
