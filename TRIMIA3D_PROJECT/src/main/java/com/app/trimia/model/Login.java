package com.app.trimia.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="login")
public class Login{
    @Id
    private String loginId;
    
    private String email;

    private String password;

    @OneToOne(cascade=CascadeType.ALL, mappedBy="login")
    private ProviderMaster serviceProviderRegistration;
    
   /* @OneToOne(cascade=CascadeType.ALL)
    private UserRegistration userRegistration;*/
    
    @OneToOne(cascade=CascadeType.ALL)
    private Role role;

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public ProviderMaster getServiceProviderRegistration() {
		return serviceProviderRegistration;
	}

	public void setServiceProviderRegistration(ProviderMaster serviceProviderRegistration) {
		this.serviceProviderRegistration = serviceProviderRegistration;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}    
    
}