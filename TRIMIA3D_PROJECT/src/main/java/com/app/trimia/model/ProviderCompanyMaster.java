package com.app.trimia.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="providerCompanyMaster")
public class ProviderCompanyMaster { 

	@Id
	private String serviceProviderCompanyId;
	
	private String serviceProviderCompanyName;
	private String serviceProviderCompanyAddress;
	private String serviceProviderCompanyPanCard;
	private String serviceProviderCompanyGstNumber;
	private String serviceProviderCompanyEmail;
	private String serviceProviderCompanyContact;
	private String serviceProviderCompanyLogo;
	private String serviceProviderCompanyShopActLicenceNumber;
	private String serviceProviderCompanyWebSite;
	private String serviceProviderCompanyOpeningTime;
	private String serviceProviderCompanyClosingTime;
	private String serviceProviderCompanyWorkingDays;
	private String quotationResponseMessge;
	

	@ManyToOne(cascade=CascadeType.ALL)
	private ProviderMaster providerMaster;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="providerCompanyMaster")
	private List<MaterialSpecializationSubCategory> productSpecialization = new ArrayList<MaterialSpecializationSubCategory>();
	
	private String keywords;

	@OneToMany(cascade=CascadeType.ALL, mappedBy="providerCompanyMaster")
	private List<ProductOrdered> productOrdered = new ArrayList<ProductOrdered>();
	
	
}