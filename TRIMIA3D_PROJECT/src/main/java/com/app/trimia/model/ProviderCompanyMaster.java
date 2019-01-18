package com.app.trimia.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="providerCompanyMaster")
public class ProviderCompanyMaster { 

	@Id
	private String providerCompanyMasterId;
	
	private String providerCompanyMasterName;
	private String providerCompanyMasterAddress;
	private String providerCompanyMasterPanCard;
	private String providerCompanyMasterGstNumber;
	private String providerCompanyMasterEmail;
	private String providerCompanyMasterContact;
	private String providerCompanyMasterLogo;
	private String providerCompanyMasterShopActLicenceNumber;
	private String providerCompanyMasterWebSite;
	private String providerCompanyMasterOpeningTime;
	private String providerCompanyMasterClosingTime;
	private String providerCompanyMasterWorkingDays;
	private String quotationResponseMessge;
	

	@ManyToOne(cascade=CascadeType.ALL)
	@JsonIgnore
	private ProviderMaster providerMaster;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="providerCompanyMaster")
	//@JsonIgnore
	private List<MaterialSpecializationSubCategory> productSpecialization = new ArrayList<MaterialSpecializationSubCategory>();
	
	private String keywords;

	@OneToMany(cascade=CascadeType.ALL, mappedBy="providerCompanyMaster")
	@JsonIgnore
	private List<ProductOrdered> productOrdered = new ArrayList<ProductOrdered>();

	public String getProviderCompanyMasterId() {
		return providerCompanyMasterId;
	}

	public void setProviderCompanyMasterId(String providerCompanyMasterId) {
		this.providerCompanyMasterId = providerCompanyMasterId;
	}

	public String getProviderCompanyMasterName() {
		return providerCompanyMasterName;
	}

	public void setProviderCompanyMasterName(String providerCompanyMasterName) {
		this.providerCompanyMasterName = providerCompanyMasterName;
	}

	public String getProviderCompanyMasterAddress() {
		return providerCompanyMasterAddress;
	}

	public void setProviderCompanyMasterAddress(String providerCompanyMasterAddress) {
		this.providerCompanyMasterAddress = providerCompanyMasterAddress;
	}

	public String getProviderCompanyMasterPanCard() {
		return providerCompanyMasterPanCard;
	}

	public void setProviderCompanyMasterPanCard(String providerCompanyMasterPanCard) {
		this.providerCompanyMasterPanCard = providerCompanyMasterPanCard;
	}

	public String getProviderCompanyMasterGstNumber() {
		return providerCompanyMasterGstNumber;
	}

	public void setProviderCompanyMasterGstNumber(String providerCompanyMasterGstNumber) {
		this.providerCompanyMasterGstNumber = providerCompanyMasterGstNumber;
	}

	public String getProviderCompanyMasterEmail() {
		return providerCompanyMasterEmail;
	}

	public void setProviderCompanyMasterEmail(String providerCompanyMasterEmail) {
		this.providerCompanyMasterEmail = providerCompanyMasterEmail;
	}

	public String getProviderCompanyMasterContact() {
		return providerCompanyMasterContact;
	}

	public void setProviderCompanyMasterContact(String providerCompanyMasterContact) {
		this.providerCompanyMasterContact = providerCompanyMasterContact;
	}

	public String getProviderCompanyMasterLogo() {
		return providerCompanyMasterLogo;
	}

	public void setProviderCompanyMasterLogo(String providerCompanyMasterLogo) {
		this.providerCompanyMasterLogo = providerCompanyMasterLogo;
	}

	public String getProviderCompanyMasterShopActLicenceNumber() {
		return providerCompanyMasterShopActLicenceNumber;
	}

	public void setProviderCompanyMasterShopActLicenceNumber(String providerCompanyMasterShopActLicenceNumber) {
		this.providerCompanyMasterShopActLicenceNumber = providerCompanyMasterShopActLicenceNumber;
	}

	public String getProviderCompanyMasterWebSite() {
		return providerCompanyMasterWebSite;
	}

	public void setProviderCompanyMasterWebSite(String providerCompanyMasterWebSite) {
		this.providerCompanyMasterWebSite = providerCompanyMasterWebSite;
	}

	public String getProviderCompanyMasterOpeningTime() {
		return providerCompanyMasterOpeningTime;
	}

	public void setProviderCompanyMasterOpeningTime(String providerCompanyMasterOpeningTime) {
		this.providerCompanyMasterOpeningTime = providerCompanyMasterOpeningTime;
	}

	public String getProviderCompanyMasterClosingTime() {
		return providerCompanyMasterClosingTime;
	}

	public void setProviderCompanyMasterClosingTime(String providerCompanyMasterClosingTime) {
		this.providerCompanyMasterClosingTime = providerCompanyMasterClosingTime;
	}

	public String getProviderCompanyMasterWorkingDays() {
		return providerCompanyMasterWorkingDays;
	}

	public void setProviderCompanyMasterWorkingDays(String providerCompanyMasterWorkingDays) {
		this.providerCompanyMasterWorkingDays = providerCompanyMasterWorkingDays;
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