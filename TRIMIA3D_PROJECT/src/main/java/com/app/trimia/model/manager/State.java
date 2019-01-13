package com.app.trimia.model.manager;

import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class State {
	@Id
	private String stateId;
	private String state;
	private String country;
	
	public String getStateId() {
		return stateId;
	}
	public void setStateId(String stateId) {
		this.stateId = stateId;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
	
}
