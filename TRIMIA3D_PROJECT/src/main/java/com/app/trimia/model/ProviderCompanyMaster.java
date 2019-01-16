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

	public String getServiceProviderCompanyId() {
		return serviceProviderCompanyId;
	}

	public void setServiceProviderCompanyId(String serviceProviderCompanyId) {
		this.serviceProviderCompanyId = serviceProviderCompanyId;
	}

	public String getServiceProviderCompanyName() {
		return serviceProviderCompanyName;
	}

	public void setServiceProviderCompanyName(String serviceProviderCompanyName) {
		this.serviceProviderCompanyName = serviceProviderCompanyName;
	}

	public String getServiceProviderCompanyAddress() {
		return serviceProviderCompanyAddress;
	}

	public void setServiceProviderCompanyAddress(String serviceProviderCompanyAddress) {
		this.serviceProviderCompanyAddress = serviceProviderCompanyAddress;
	}

	public String getServiceProviderCompanyPanCard() {
		return serviceProviderCompanyPanCard;
	}

	public void setServiceProviderCompanyPanCard(String serviceProviderCompanyPanCard) {
		this.serviceProviderCompanyPanCard = serviceProviderCompanyPanCard;
	}

	public String getServiceProviderCompanyGstNumber() {
		return serviceProviderCompanyGstNumber;
	}

	public void setServiceProviderCompanyGstNumber(String serviceProviderCompanyGstNumber) {
		this.serviceProviderCompanyGstNumber = serviceProviderCompanyGstNumber;
	}

	public String getServiceProviderCompanyEmail() {
		return serviceProviderCompanyEmail;
	}

	public void setServiceProviderCompanyEmail(String serviceProviderCompanyEmail) {
		this.serviceProviderCompanyEmail = serviceProviderCompanyEmail;
	}

	public String getServiceProviderCompanyContact() {
		return serviceProviderCompanyContact;
	}

	public void setServiceProviderCompanyContact(String serviceProviderCompanyContact) {
		this.serviceProviderCompanyContact = serviceProviderCompanyContact;
	}

	public String getServiceProviderCompanyLogo() {
		return serviceProviderCompanyLogo;
	}

	public void setServiceProviderCompanyLogo(String serviceProviderCompanyLogo) {
		this.serviceProviderCompanyLogo = serviceProviderCompanyLogo;
	}

	public String getServiceProviderCompanyShopActLicenceNumber() {
		return serviceProviderCompanyShopActLicenceNumber;
	}

	public void setServiceProviderCompanyShopActLicenceNumber(String serviceProviderCompanyShopActLicenceNumber) {
		this.serviceProviderCompanyShopActLicenceNumber = serviceProviderCompanyShopActLicenceNumber;
	}

	public String getServiceProviderCompanyWebSite() {
		return serviceProviderCompanyWebSite;
	}

	public void setServiceProviderCompanyWebSite(String serviceProviderCompanyWebSite) {
		this.serviceProviderCompanyWebSite = serviceProviderCompanyWebSite;
	}

	public String getServiceProviderCompanyOpeningTime() {
		return serviceProviderCompanyOpeningTime;
	}

	public void setServiceProviderCompanyOpeningTime(String serviceProviderCompanyOpeningTime) {
		this.serviceProviderCompanyOpeningTime = serviceProviderCompanyOpeningTime;
	}

	public String getServiceProviderCompanyClosingTime() {
		return serviceProviderCompanyClosingTime;
	}

	public void setServiceProviderCompanyClosingTime(String serviceProviderCompanyClosingTime) {
		this.serviceProviderCompanyClosingTime = serviceProviderCompanyClosingTime;
	}

	public String getServiceProviderCompanyWorkingDays() {
		return serviceProviderCompanyWorkingDays;
	}

	public void setServiceProviderCompanyWorkingDays(String serviceProviderCompanyWorkingDays) {
		this.serviceProviderCompanyWorkingDays = serviceProviderCompanyWorkingDays;
	}

	public String getQuotationResponseMessge() {
		return quotationResponseMessge;
	}

	public void setQuotationResponseMessge(String quotationResponseMessge) {
		this.quotationResponseMessge = quotationResponseMessge;
	}

	public ProviderMaster getProviderMaster() {
		return providerMaster;
	}

	public void setProviderMaster(ProviderMaster providerMaster) {
		this.providerMaster = providerMaster;
	}

	public List<MaterialSpecializationSubCategory> getProductSpecialization() {
		return productSpecialization;
	}

	public void setProductSpecialization(List<MaterialSpecializationSubCategory> productSpecialization) {
		this.productSpecialization = productSpecialization;
	}

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public List<ProductOrdered> getProductOrdered() {
		return productOrdered;
	}

	public void setProductOrdered(List<ProductOrdered> productOrdered) {
		this.productOrdered = productOrdered;
	}
	
	
	
}