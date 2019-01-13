package com.app.trimia.model.serviceprovider;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class CompanyMasterClient {
	@Id
	private String clientId;
	
	private String clientName;
	private String clientLogo;

	@ManyToOne(cascade=CascadeType.ALL)
	private ProviderMaster serviceProviderRegistration;
	
	//company
	
}