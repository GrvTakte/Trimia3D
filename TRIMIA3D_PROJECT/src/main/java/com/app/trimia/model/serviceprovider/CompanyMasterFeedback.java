package com.app.trimia.model.serviceprovider;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class CompanyMasterFeedback {
	
	@Id
	private String feedbackId;
	
	private String feedbackRating;
	private String feedbackReview;
	private String feedbackDateAndTime;

	@OneToOne(cascade=CascadeType.ALL)
	private ProductOrdered productOrdered;

	public String getFeedbackId() {
		return feedbackId;
	}

	public void setFeedbackId(String feedbackId) {
		this.feedbackId = feedbackId;
	}

	public String getFeedbackRating() {
		return feedbackRating;
	}

	public void setFeedbackRating(String feedbackRating) {
		this.feedbackRating = feedbackRating;
	}

	public String getFeedbackReview() {
		return feedbackReview;
	}

	public void setFeedbackReview(String feedbackReview) {
		this.feedbackReview = feedbackReview;
	}

	public String getFeedbackDateAndTime() {
		return feedbackDateAndTime;
	}

	public void setFeedbackDateAndTime(String feedbackDateAndTime) {
		this.feedbackDateAndTime = feedbackDateAndTime;
	}

	public ProductOrdered getProductOrdered() {
		return productOrdered;
	}

	public void setProductOrdered(ProductOrdered productOrdered) {
		this.productOrdered = productOrdered;
	}
	
	

}