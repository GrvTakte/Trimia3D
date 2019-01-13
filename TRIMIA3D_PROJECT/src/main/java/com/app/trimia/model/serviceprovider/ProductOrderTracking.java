package com.app.trimia.model.serviceprovider;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class ProductOrderTracking {
	@Id
	private String productOrderTrackingId;
	
	private String productOrderTrackingStatus;
	private String productOrderTrackingStatusUpdateDate;
	private String productOrderTrackingStatusUpdateTime;
	private String productOrderTrackingDescription;
	private String productOrderTrackingExpectedDate;
	private String productOrderTrackingDelieveredDate;

	@OneToOne(cascade=CascadeType.ALL)
	private ProductOrdered productOrdered;
}