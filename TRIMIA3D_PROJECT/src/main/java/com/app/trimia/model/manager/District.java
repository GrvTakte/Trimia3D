package com.app.trimia.model.manager;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class District {
	@Id
	private String districtId;
	private String district;
	private String state;
	
	public String getDistrictId() {
		return districtId;
	}
	public void setDistrictId(String districtId) {
		this.districtId = districtId;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	
}
