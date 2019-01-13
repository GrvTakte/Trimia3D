package com.app.trimia.model.manager;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ServiceProviderRegistration {

	@Id
	private String serviceProviderRegistrationId;

	public String getServiceProviderRegistrationId() {
		return serviceProviderRegistrationId;
	}

	public void setServiceProviderRegistrationId(String serviceProviderRegistrationId) {
		this.serviceProviderRegistrationId = serviceProviderRegistrationId;
	}
}
