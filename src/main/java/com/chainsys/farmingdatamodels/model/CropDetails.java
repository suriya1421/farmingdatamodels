package com.chainsys.farmingdatamodels.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "cropdetails")
public class CropDetails {
	@Id
	@Column(name = "crop_id")
	private int cropId;
	@Column(name = "crop_name")
	private String cropName;
	@Column(name = "description")
	private String description;
	@Column(name = "duration")
	private int duration;
	@OneToMany(mappedBy="cropDetails",fetch=FetchType.LAZY)
	private List<CropFertilizerDetails> fertilizerDetails;

	public List<CropFertilizerDetails> getFertilizerDetails() {
		return fertilizerDetails;
	}
    
	public void setFertilizerDetails(List<CropFertilizerDetails> fertilizerDetails) {
		this.fertilizerDetails = fertilizerDetails;
	}

	@OneToMany(mappedBy="cropDetails",fetch=FetchType.LAZY)
	private List<CropDiseaseDetails> cropDiseaseDetails;
	public int getCropId() {
		return cropId;
	}

	public List<CropDiseaseDetails> getCropDiseaseDetails() {
		return cropDiseaseDetails;
	}

	public void setCropDiseaseDetails(List<CropDiseaseDetails> cropDiseaseDetail) {
		this.cropDiseaseDetails = cropDiseaseDetail;
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
