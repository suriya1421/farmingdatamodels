package com.chainsys.farmingdatamodels.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Fertilizer {
	@Id
	@Column(name = "fer_id")
	private int fertilizerId;
	@Column(name = "fer_name")
	private String fertilizerName;
	@Column(name = "state")
	private String state;
	@Column(name = "cost")
	private int cost;

	@OneToMany(fetch=FetchType.LAZY)
	private List<CropFertilizerDetails> fertilizerDetails;

	public List<CropFertilizerDetails> getFertilizerDetails() {
		return fertilizerDetails;
	}

	public void setFertilizerDetails(List<CropFertilizerDetails> fertilizerDetails) {
		this.fertilizerDetails = fertilizerDetails;
	}

	public int getFertilizerId() {
		return fertilizerId;
	}

	public void setFertilizerId(int fertilizerId) {
		this.fertilizerId = fertilizerId;
	}

	public String getFertilizerName() {
		return fertilizerName;
	}

	public void setFertilizerName(String fertilizerName) {
		this.fertilizerName = fertilizerName;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

}
