package com.app.trimia.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="companyMasterFeedback")
public class CompanyMasterFeedback {
	
	@Id
	private String feedbackId;
	
	private String feedbackRating;
	private String feedbackReview;
	private String feedbackDateAndTime;

	@OneToOne(cascade=CascadeType.ALL)
	@JsonIgnore
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