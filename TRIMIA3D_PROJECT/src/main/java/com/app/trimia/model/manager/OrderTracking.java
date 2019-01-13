package com.app.trimia.model.manager;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author 
 * @role ServiceProvider 
 * 
 *  */
@Entity
public class OrderTracking {

	@Id
	private String orderTrackingId;

	public String getOrderTrackingId() {
		return orderTrackingId;
	}

	public void setOrderTrackingId(String orderTrackingId) {
		this.orderTrackingId = orderTrackingId;
	}
	
}
