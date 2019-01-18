package com.app.trimia.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Membership {

	@Id
	private String membershipId;
	private String membershipType;
	private Date membershipStartDate;
	private Date membershipEndDate;
	private String membershipStatus;
	
	@OneToOne(cascade=CascadeType.ALL)
	private ProviderMaster providerMaster;

	public String getMembershipId() {
		return membershipId;
	}

	public void setMembershipId(String membershipId) {
		this.membershipId = membershipId;
	}

	public String getMembershipType() {
		return membershipType;
	}

	public void setMembershipType(String membershipType) {
		this.membershipType = membershipType;
	}

	public Date getMembershipStartDate() {
		return membershipStartDate;
	}

	public void setMembershipStartDate(Date membershipStartDate) {
		this.membershipStartDate = membershipStartDate;
	}

	public Date getMembershipEndDate() {
		return membershipEndDate;
	}

	public void setMembershipEndDate(Date membershipEndDate) {
		this.membershipEndDate = membershipEndDate;
	}

	public String getMembershipStatus() {
		return membershipStatus;
	}

	public void setMembershipStatus(String membershipStatus) {
		this.membershipStatus = membershipStatus;
	}

	public ProviderMaster getProviderMaster() {
		return providerMaster;
	}

	public void setProviderMaster(ProviderMaster providerMaster) {
		this.providerMaster = providerMaster;
	}
}
