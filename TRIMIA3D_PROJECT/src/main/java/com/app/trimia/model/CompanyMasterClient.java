package com.app.trimia.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="companyMasterClient")
public class CompanyMasterClient {
	@Id
	private String companyMasterClientId;
	
	private String companyMasterClientName;
	private String companyMasterClientLogo;

	@ManyToOne(cascade=CascadeType.ALL)
	private ProviderMaster providerMaster;
	
	@ManyToOne(cascade=CascadeType.ALL)
	ProviderCompanyMaster providerCompanyMaster;

	public String getCompanyMasterClientId() {
		return companyMasterClientId;
	}

	public void setCompanyMasterClientId(String companyMasterClientId) {
		this.companyMasterClientId = companyMasterClientId;
	}

	public String getCompanyMasterClientName() {
		return companyMasterClientName;
	}

	public void setCompanyMasterClientName(String companyMasterClientName) {
		this.companyMasterClientName = companyMasterClientName;
	}

	public String getCompanyMasterClientLogo() {
		return companyMasterClientLogo;
	}

	public void setCompanyMasterClientLogo(String companyMasterClientLogo) {
		this.companyMasterClientLogo = companyMasterClientLogo;
	}

	public ProviderMaster getProviderMaster() {
		return providerMaster;
	}

	public void setProviderMaster(ProviderMaster providerMaster) {
		this.providerMaster = providerMaster;
	}

	public ProviderCompanyMaster getProviderCompanyMaster() {
		return providerCompanyMaster;
	}

	public void setProviderCompanyMaster(ProviderCompanyMaster providerCompanyMaster) {
		this.providerCompanyMaster = providerCompanyMaster;
	}


	
}