package com.chainsys.farmingdatamodels.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Fertilizer {
	@Id
	private int fer_id;
	private String fer_name;
	private String state;
	private int cost;
	private String stock_in_hand;

	
	public int getFer_id() {
		return fer_id;
	}
	public void setFer_id(int fer_id) {
		this.fer_id = fer_id;
	}
	public String getFer_name() {
		return fer_name;
	}
	public void setFer_name(String fer_name) {
		this.fer_name = fer_name;
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
	public String getStock_in_hand() {
		return stock_in_hand;
	}
	public void setStock_in_hand(String stock_in_hand) {
		this.stock_in_hand = stock_in_hand;
	}
	
}

