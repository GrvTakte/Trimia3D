package com.app.trimia.model.manager;

import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
/**
 * @author Navnath Erande
 * @role Manager
 * @Description
 * @whoUses 
 */
@Entity
public class ManagerPersonalInfo {

	@Id
	private String managerId;
	private String managerName;
	private String profileImageUrl;
	private String contactNumber;
	private String pancard;
	private String Aadhaar;
	private String dateOfBirth;
	
	@OneToMany(cascade=CascadeType.ALL)
	private Map<String, Address> mapAddresses;
	
	@OneToOne(cascade=CascadeType.ALL)
	private LoginDetail loginDetail;
	
	
	public String getManagerId() {
		return managerId;
	}
	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	public String getProfileImageUrl() {
		return profileImageUrl;
	}
	public void setProfileImageUrl(String profileImageUrl) {
		this.profileImageUrl = profileImageUrl;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getPancard() {
		return pancard;
	}
	public void setPancard(String pancard) {
		this.pancard = pancard;
	}
	public String getAadhaar() {
		return Aadhaar;
	}
	public void setAadhaar(String aadhaar) {
		Aadhaar = aadhaar;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public LoginDetail getLoginDetail() {
		return loginDetail;
	}
	public void setLoginDetail(LoginDetail loginDetail) {
		this.loginDetail = loginDetail;
	}
	public Map<String, Address> getMapAddresses() {
		return mapAddresses;
	}
	public void setMapAddresses(Map<String, Address> mapAddresses) {
		this.mapAddresses = mapAddresses;
	}

	
}
