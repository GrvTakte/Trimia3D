package com.app.trimia.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
public class MaterialSpecializationCategory 
{
	@Id
	private String specializationCategoryId;
	
	private String specializationCategoryName;
	
	@ManyToOne(cascade=CascadeType.ALL)
	ProviderCompanyMaster providerCompanyMaster;
	
	public String getSpecializationCategoryId() {
		return specializationCategoryId;
	}
	public void setSpecializationCategoryId(String specializationCategoryId) {
		this.specializationCategoryId = specializationCategoryId;
	}
	public String getSpecializationCategoryName() {
		return specializationCategoryName;
	}
	public void setSpecializationCategoryName(String specializationCategoryName) {
		this.specializationCategoryName = specializationCategoryName;
	}
	public ProviderCompanyMaster getProviderCompanyMaster() {
		return providerCompanyMaster;
	}
	public void setProviderCompanyMaster(ProviderCompanyMaster providerCompanyMaster) {
		this.providerCompanyMaster = providerCompanyMaster;
	}
	
}