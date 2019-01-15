package com.app.trimia.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="materialSpecializationSubCategory")
public class MaterialSpecializationSubCategory {
	
	@Id
	private String specializationSubCategoryId;
	
	private String specializationSubCategoryName;
	private String specializationSubCategoryCode;
	private String specializationSubCategoryDescription;
	private String specializationSubCategoryImageUrl;
	private String specializationSubCategoryColor;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private ProviderCompanyMaster providerCompanyMaster;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private MaterialSpecializationCategory materialSpecializationCategory;
	
	@OneToOne(cascade=CascadeType.ALL)
	private UserOffer userOffer;

	
	public String getSpecializationSubCategoryId() {
		return specializationSubCategoryId;
	}

	public void setSpecializationSubCategoryId(String specializationSubCategoryId) {
		this.specializationSubCategoryId = specializationSubCategoryId;
	}

	public String getSpecializationSubCategoryName() {
		return specializationSubCategoryName;
	}

	public void setSpecializationSubCategoryName(String specializationSubCategoryName) {
		this.specializationSubCategoryName = specializationSubCategoryName;
	}

	public String getSpecializationSubCategoryCode() {
		return specializationSubCategoryCode;
	}

	public void setSpecializationSubCategoryCode(String specializationSubCategoryCode) {
		this.specializationSubCategoryCode = specializationSubCategoryCode;
	}

	public String getSpecializationSubCategoryDescription() {
		return specializationSubCategoryDescription;
	}

	public void setSpecializationSubCategoryDescription(String specializationSubCategoryDescription) {
		this.specializationSubCategoryDescription = specializationSubCategoryDescription;
	}

	public String getSpecializationSubCategoryImageUrl() {
		return specializationSubCategoryImageUrl;
	}

	public void setSpecializationSubCategoryImageUrl(String specializationSubCategoryImageUrl) {
		this.specializationSubCategoryImageUrl = specializationSubCategoryImageUrl;
	}

	public String getSpecializationSubCategoryColor() {
		return specializationSubCategoryColor;
	}

	public void setSpecializationSubCategoryColor(String specializationSubCategoryColor) {
		this.specializationSubCategoryColor = specializationSubCategoryColor;
	}

	public ProviderCompanyMaster getProviderCompanyMaster() {
		return providerCompanyMaster;
	}

	public void setProviderCompanyMaster(ProviderCompanyMaster providerCompanyMaster) {
		this.providerCompanyMaster = providerCompanyMaster;
	}

	public MaterialSpecializationCategory getMaterialSpecializationCategory() {
		return materialSpecializationCategory;
	}

	public void setMaterialSpecializationCategory(MaterialSpecializationCategory materialSpecializationCategory) {
		this.materialSpecializationCategory = materialSpecializationCategory;
	}

	public UserOffer getUserOffer() {
		return userOffer;
	}

	public void setUserOffer(UserOffer userOffer) {
		this.userOffer = userOffer;
	}
	
	
}