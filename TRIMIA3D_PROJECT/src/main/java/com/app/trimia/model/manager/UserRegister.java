package com.app.trimia.model.manager;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author 
 * @role User
 */
@Entity
public class UserRegister {

	@Id
	private String userRegisterId;
	private String userFullName;
	private String userEmail;
	private double userContact;


	public String getUserRegisterId() {
		return userRegisterId;
	}

	public void setUserRegisterId(String userRegisterId) {
		this.userRegisterId = userRegisterId;
	}

	public String getUserFullName() {
		return userFullName;
	}

	public void setUserFullName(String userFullName) {
		this.userFullName = userFullName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public double getUserContact() {
		return userContact;
	}

	public void setUserContact(double userContact) {
		this.userContact = userContact;
	}

}
