package com.chainsys.farmingdatamodels.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="userdetails")
public class UserDetails {
@Id
private int user_id;
private String password;
private String user_name;
private String email;
private long phone_number;
private String address;

public int getUser_id() {
	return user_id;
}
public void setUser_id(int user_id) {
	this.user_id = user_id;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getUser_name() {
	return user_name;
}
public void setUser_name(String user_name) {
	this.user_name = user_name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public long getPhone_number() {
	return phone_number;
}
public void setPhone_number(long phone_number) {
	this.phone_number = phone_number;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}

}

