package com.app.trimia.model.serviceprovider;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="productOrderTracking")
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

	public String getProductOrderTrackingId() {
		return productOrderTrackingId;
	}

	public void setProductOrderTrackingId(String productOrderTrackingId) {
		this.productOrderTrackingId = productOrderTrackingId;
	}

	public String getProductOrderTrackingStatus() {
		return productOrderTrackingStatus;
	}

	public void setProductOrderTrackingStatus(String productOrderTrackingStatus) {
		this.productOrderTrackingStatus = productOrderTrackingStatus;
	}

	public String getProductOrderTrackingStatusUpdateDate() {
		return productOrderTrackingStatusUpdateDate;
	}

	public void setProductOrderTrackingStatusUpdateDate(String productOrderTrackingStatusUpdateDate) {
		this.productOrderTrackingStatusUpdateDate = productOrderTrackingStatusUpdateDate;
	}

	public String getProductOrderTrackingStatusUpdateTime() {
		return productOrderTrackingStatusUpdateTime;
	}

	public void setProductOrderTrackingStatusUpdateTime(String productOrderTrackingStatusUpdateTime) {
		this.productOrderTrackingStatusUpdateTime = productOrderTrackingStatusUpdateTime;
	}

	public String getProductOrderTrackingDescription() {
		return productOrderTrackingDescription;
	}

	public void setProductOrderTrackingDescription(String productOrderTrackingDescription) {
		this.productOrderTrackingDescription = productOrderTrackingDescription;
	}

	public String getProductOrderTrackingExpectedDate() {
		return productOrderTrackingExpectedDate;
	}

	public void setProductOrderTrackingExpectedDate(String productOrderTrackingExpectedDate) {
		this.productOrderTrackingExpectedDate = productOrderTrackingExpectedDate;
	}

	public String getProductOrderTrackingDelieveredDate() {
		return productOrderTrackingDelieveredDate;
	}

	public void setProductOrderTrackingDelieveredDate(String productOrderTrackingDelieveredDate) {
		this.productOrderTrackingDelieveredDate = productOrderTrackingDelieveredDate;
	}

	public ProductOrdered getProductOrdered() {
		return productOrdered;
	}

	public void setProductOrdered(ProductOrdered productOrdered) {
		this.productOrdered = productOrdered;
	}
	
	
}