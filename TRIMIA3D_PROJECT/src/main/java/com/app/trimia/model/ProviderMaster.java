package com.app.trimia.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="providerMaster")
public class ProviderMaster {
	//registration field
	@Id
	private String serviceProviderRegistrationId;
	
	private String serviceProviderName;
	private String serviceProviderEmail;
	private String serviceProviderContact;

	//update field
	private String serviceProviderPanCard;
	private String serviceProviderAadhaar;
	private String serviceProviderProfileImage;

	@OneToOne(cascade=CascadeType.ALL)
	private Login login;
	
	//update field
	@OneToMany(cascade=CascadeType.ALL, mappedBy="providerMaster")
	private List<Address> address=new ArrayList<Address>();
	
	//update field
	@OneToMany(cascade=CascadeType.ALL, mappedBy="providerMaster")
	private List<ProviderCompanyMaster> serviceProviderCompanyDetails=new ArrayList<ProviderCompanyMaster>();
	
	//update field
	/*@OneToOne(cascade=CascadeType.ALL)
	private Membership memberShipId;*/

	@OneToMany(cascade=CascadeType.ALL, mappedBy="providerMaster")
	private List<CompanyMasterClient> serviceProviderClient = new ArrayList<CompanyMasterClient>();
}