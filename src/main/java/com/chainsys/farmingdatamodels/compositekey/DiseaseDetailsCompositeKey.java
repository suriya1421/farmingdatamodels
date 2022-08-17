package com.chainsys.farmingdatamodels.compositekey;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Id;

public class DiseaseDetailsCompositeKey implements Serializable {
	@Column(name="crop_id")
	private int cropId;
	@Column(name="disease_id")
	private int diseaseId;

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

	@Override
	public int hashCode() {
		return Objects.hash(cropId, diseaseId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DiseaseDetailsCompositeKey other = (DiseaseDetailsCompositeKey) obj;
		return cropId == other.cropId && diseaseId == other.diseaseId;
	}

}
