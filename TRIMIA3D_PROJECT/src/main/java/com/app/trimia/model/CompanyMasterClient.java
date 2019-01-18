package com.app.trimia.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="companyMasterClient")
public class CompanyMasterClient {
	@Id
	private String clientId;
	
	private String clientName;
	private String clientLogo;

	@ManyToOne(cascade=CascadeType.ALL)
	@JsonIgnore
	private ProviderMaster providerMaster;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JsonIgnore
	ProviderCompanyMaster providerCompanyMaster;

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getClientLogo() {
		return clientLogo;
	}

	public void setClientLogo(String clientLogo) {
		this.clientLogo = clientLogo;
	}

	public ProviderMaster getServiceProviderRegistration() {
		return providerMaster;
	}

	public void setServiceProviderRegistration(ProviderMaster serviceProviderRegistration) {
		this.providerMaster = serviceProviderRegistration;
	}

	public ProviderCompanyMaster getProviderCompanyMaster() {
		return providerCompanyMaster;
	}

	public void setProviderCompanyMaster(ProviderCompanyMaster providerCompanyMaster) {
		this.providerCompanyMaster = providerCompanyMaster;
	}
	
}