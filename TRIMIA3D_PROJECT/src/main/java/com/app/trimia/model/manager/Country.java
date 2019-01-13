package com.app.trimia.model.manager;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Country {
	@Id
	private String countryId; 
	private String country;
	
	public String getCountryId() {
		return countryId;
	}
	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
}
