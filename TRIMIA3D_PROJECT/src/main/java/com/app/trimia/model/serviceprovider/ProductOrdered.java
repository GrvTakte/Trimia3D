package com.app.trimia.model.serviceprovider;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class ProductOrdered {
	
	@Id
	private String orderId;
	
	private String fileUrl;
	private String orderDate;
	private String orderTime;
	private String completionDate;
	
	@OneToOne(cascade=CascadeType.ALL)
	private MaterialSpecializationSubCategory productSpecialization;

	@ManyToOne(cascade=CascadeType.ALL)
	private ProviderCompanyMaster serviceProviderCompanyDetails;

	/*@ManyToOne(cascade=CascadeType.ALL)
	private UserRegistration userRegistration;*/

	@OneToOne(cascade=CascadeType.ALL, mappedBy="productOrdered")
	private CompanyMasterFeedback feedbackOnCompany;

	//vishal
	//private OrderCommission orderCommission;
	
	@OneToOne(cascade=CascadeType.ALL, mappedBy="productOrdered")
	private ProductOrderTracking productOrderTracking;

	/*@OneToOne(cascade=CascadeType.ALL, mappedBy="productOrdered")
	private ProductPaymentStatus productPaymentStatus;*/
}