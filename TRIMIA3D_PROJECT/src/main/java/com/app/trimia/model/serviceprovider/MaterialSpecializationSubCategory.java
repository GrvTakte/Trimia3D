package com.app.trimia.model.serviceprovider;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class MaterialSpecializationSubCategory {
	
	@Id
	private String productSpecializationId;
	
	private String productSpecializationName;
	private String productSpecializationCode;
	private String productSpecializationDescription;
	private String productSpecializationImageUrl;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private ProviderCompanyMaster serviceProviderCompanyDetails;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private MaterialSpecializationCategory specializationCategory;
	
	@OneToOne(cascade=CascadeType.ALL)
	private UserOffer productSpecializationOffer;
}