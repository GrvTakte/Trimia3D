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



	public String getProviderMasterId() {
		return providerMasterId;
	}

	public void setProviderMasterId(String providerMasterId) {
		this.providerMasterId = providerMasterId;
	}

	public String getProviderMasterName() {
		return providerMasterName;
	}

	public void setProviderMasterName(String providerMasterName) {
		this.providerMasterName = providerMasterName;
	}

	public String getProviderMasterEmail() {
		return providerMasterEmail;
	}

	public void setProviderMasterEmail(String providerMasterEmail) {
		this.providerMasterEmail = providerMasterEmail;
	}

	public String getProviderMasterContact() {
		return providerMasterContact;
	}

	public void setProviderMasterContact(String providerMasterContact) {
		this.providerMasterContact = providerMasterContact;
	}

	public String getProviderMasterPanCard() {
		return providerMasterPanCard;
	}

	public void setProviderMasterPanCard(String providerMasterPanCard) {
		this.providerMasterPanCard = providerMasterPanCard;
	}

	public String getProviderMasterAadhaar() {
		return providerMasterAadhaar;
	}

	public void setProviderMasterAadhaar(String providerMasterAadhaar) {
		this.providerMasterAadhaar = providerMasterAadhaar;
	}

	public String getProviderMasterProfileImage() {
		return providerMasterProfileImage;
	}

	public void setProviderMasterProfileImage(String providerMasterProfileImage) {
		this.providerMasterProfileImage = providerMasterProfileImage;
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