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
	private String providerMasterId;
	
	private String providerMasterName;
	private String providerMasterEmail;
	private String providerMasterContact;

	//update field
	private String providerMasterPanCard;
	private String providerMasterAadhaar;
	private String providerMasterProfileImage;

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

	public String getServiceProviderRegistrationId() {
		return serviceProviderRegistrationId;
	}

	public void setServiceProviderRegistrationId(String serviceProviderRegistrationId) {
		this.serviceProviderRegistrationId = serviceProviderRegistrationId;
	}

	public String getServiceProviderName() {
		return serviceProviderName;
	}

	public void setServiceProviderName(String serviceProviderName) {
		this.serviceProviderName = serviceProviderName;
	}

	public String getServiceProviderEmail() {
		return serviceProviderEmail;
	}

	public void setServiceProviderEmail(String serviceProviderEmail) {
		this.serviceProviderEmail = serviceProviderEmail;
	}

	public String getServiceProviderContact() {
		return serviceProviderContact;
	}

	public void setServiceProviderContact(String serviceProviderContact) {
		this.serviceProviderContact = serviceProviderContact;
	}

	public String getServiceProviderPanCard() {
		return serviceProviderPanCard;
	}

	public void setServiceProviderPanCard(String serviceProviderPanCard) {
		this.serviceProviderPanCard = serviceProviderPanCard;
	}

	public String getServiceProviderAadhaar() {
		return serviceProviderAadhaar;
	}

	public void setServiceProviderAadhaar(String serviceProviderAadhaar) {
		this.serviceProviderAadhaar = serviceProviderAadhaar;
	}

	public String getServiceProviderProfileImage() {
		return serviceProviderProfileImage;
	}

	public void setServiceProviderProfileImage(String serviceProviderProfileImage) {
		this.serviceProviderProfileImage = serviceProviderProfileImage;
	}

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	public List<ProviderCompanyMaster> getServiceProviderCompanyDetails() {
		return serviceProviderCompanyDetails;
	}

	public void setServiceProviderCompanyDetails(List<ProviderCompanyMaster> serviceProviderCompanyDetails) {
		this.serviceProviderCompanyDetails = serviceProviderCompanyDetails;
	}

	public List<CompanyMasterClient> getServiceProviderClient() {
		return serviceProviderClient;
	}

	public void setServiceProviderClient(List<CompanyMasterClient> serviceProviderClient) {
		this.serviceProviderClient = serviceProviderClient;
	}
	
	
	
}