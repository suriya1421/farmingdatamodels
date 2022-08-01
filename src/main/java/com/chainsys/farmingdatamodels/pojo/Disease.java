package com.chainsys.farmingdatamodels.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Disease {
	@Id
private int disease_id;
private String disease_name;
private String reason;
private String medicine;
private String prevention;


public int getDisease_id() {
	return disease_id;
}
public void setDisease_id(int disease_id) {
	this.disease_id = disease_id;
}
public String getDisease_name() {
	return disease_name;
}
public void setDisease_name(String disease_name) {
	this.disease_name = disease_name;
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
