package com.app.trimia.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class SampleProduct {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int sampleProductId;
	
	private String sampleProductImage;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private ProviderCompanyMaster providerCompanyMaster;

	public int getSampleProductId() {
		return sampleProductId;
	}

	public void setSampleProductId(int sampleProductId) {
		this.sampleProductId = sampleProductId;
	}

	public String getSampleProductImage() {
		return sampleProductImage;
	}

	public void setSampleProductImage(String sampleProductImage) {
		this.sampleProductImage = sampleProductImage;
	}

	public ProviderCompanyMaster getProviderCompanyMaster() {
		return providerCompanyMaster;
	}

	public void setProviderCompanyMaster(ProviderCompanyMaster providerCompanyMaster) {
		this.providerCompanyMaster = providerCompanyMaster;
	}
	
}
