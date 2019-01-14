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
	private String productSpecializationId;
	
	private String productSpecializationName;
	private String productSpecializationCode;
	private String productSpecializationDescription;
	private String productSpecializationImageUrl;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private ProviderCompanyMaster providerCompanyMaster;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private MaterialSpecializationCategory materialSpecializationCategory;
	
	@OneToOne(cascade=CascadeType.ALL)
	private UserOffer userOffer;

	public String getProductSpecializationId() {
		return productSpecializationId;
	}

	public void setProductSpecializationId(String productSpecializationId) {
		this.productSpecializationId = productSpecializationId;
	}

	public String getProductSpecializationName() {
		return productSpecializationName;
	}

	public void setProductSpecializationName(String productSpecializationName) {
		this.productSpecializationName = productSpecializationName;
	}

	public String getProductSpecializationCode() {
		return productSpecializationCode;
	}

	public void setProductSpecializationCode(String productSpecializationCode) {
		this.productSpecializationCode = productSpecializationCode;
	}

	public String getProductSpecializationDescription() {
		return productSpecializationDescription;
	}

	public void setProductSpecializationDescription(String productSpecializationDescription) {
		this.productSpecializationDescription = productSpecializationDescription;
	}

	public String getProductSpecializationImageUrl() {
		return productSpecializationImageUrl;
	}

	public void setProductSpecializationImageUrl(String productSpecializationImageUrl) {
		this.productSpecializationImageUrl = productSpecializationImageUrl;
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