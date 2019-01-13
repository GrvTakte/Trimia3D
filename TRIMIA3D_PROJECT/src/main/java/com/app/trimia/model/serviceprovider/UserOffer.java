package com.app.trimia.model.serviceprovider;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class UserOffer
{
	@Id
	private String userOfferId;
	
	private String userOfferName;
	private String userOfferStartDate;
	private String userOfferEndDate;
	private String userOfferDiscount;
	private String userOfferPublishDate;
	private String userOfferUpdateDate;
	
	private String userAdminOfferPercentage;
	//private String productSpecializationOfferPromoCode;
	//private String productSpecializationOfferLogo;
	
	//company
	
	@OneToOne(cascade=CascadeType.ALL, mappedBy="productSpecializationOffer")
	MaterialSpecializationSubCategory productSpecialization;	
}