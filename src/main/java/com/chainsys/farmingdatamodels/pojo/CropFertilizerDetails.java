package com.chainsys.farmingdatamodels.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cropfertilizerdetails")
public class CropFertilizerDetails {
	@Id
	private int crop_id;
	private int fer_id;
	private String quantity;
	private String stage_of_use;

	public int getCrop_id() {
		return crop_id;
	}

	public void setCrop_id(int crop_id) {
		this.crop_id = crop_id;
	}

	public int getFer_id() {
		return fer_id;
	}

	public void setFer_id(int fer_id) {
		this.fer_id = fer_id;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getStage_of_use() {
		return stage_of_use;
	}

	public void setStage_of_use(String stage_of_use) {
		this.stage_of_use = stage_of_use;
	}

}
