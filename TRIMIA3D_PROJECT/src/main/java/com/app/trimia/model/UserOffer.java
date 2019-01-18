package com.app.trimia.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="userOffer")
public class UserOffer
{
	@Id
	private String userOfferId;
	
	private String userOfferName;
	private String userOfferStartDate;
	private String userOfferEndDate;
	private String userOfferPublishDate;
	private String userOfferUpdateDate;
	private String userAdminOfferPercentage;
	
	@OneToOne(cascade=CascadeType.ALL, mappedBy="userOffer")
	@JsonIgnore
	MaterialSpecializationSubCategory materialSpecializationSubCategory;

	public String getUserOfferId() {
		return userOfferId;
	}

	public void setUserOfferId(String userOfferId) {
		this.userOfferId = userOfferId;
	}

	public String getUserOfferName() {
		return userOfferName;
	}

	public void setUserOfferName(String userOfferName) {
		this.userOfferName = userOfferName;
	}

	public String getUserOfferStartDate() {
		return userOfferStartDate;
	}

	public void setUserOfferStartDate(String userOfferStartDate) {
		this.userOfferStartDate = userOfferStartDate;
	}

	public String getUserOfferEndDate() {
		return userOfferEndDate;
	}

	public void setUserOfferEndDate(String userOfferEndDate) {
		this.userOfferEndDate = userOfferEndDate;
	}

	public String getUserOfferPublishDate() {
		return userOfferPublishDate;
	}

	public void setUserOfferPublishDate(String userOfferPublishDate) {
		this.userOfferPublishDate = userOfferPublishDate;
	}

	public String getUserOfferUpdateDate() {
		return userOfferUpdateDate;
	}

	public void setUserOfferUpdateDate(String userOfferUpdateDate) {
		this.userOfferUpdateDate = userOfferUpdateDate;
	}

	public String getUserAdminOfferPercentage() {
		return userAdminOfferPercentage;
	}

	public void setUserAdminOfferPercentage(String userAdminOfferPercentage) {
		this.userAdminOfferPercentage = userAdminOfferPercentage;
	}

	public MaterialSpecializationSubCategory getProductSpecialization() {
		return materialSpecializationSubCategory;
	}

	public void setProductSpecialization(MaterialSpecializationSubCategory productSpecialization) {
		this.materialSpecializationSubCategory = productSpecialization;
	}	
}