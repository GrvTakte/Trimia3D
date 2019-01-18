package com.app.trimia.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Feedback 
{
	@Id
	 private String id;
	 private String userRating;
	 private String userReview;
	 private String dateAndTime;
	 
	 @OneToOne(cascade=CascadeType.ALL)
	private ProductOrdered productOrdered;

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUserRating() {
		return userRating;
	}
	public void setUserRating(String userRating) {
		this.userRating = userRating;
	}
	public String getUserReview() {
		return userReview;
	}
	public void setUserReview(String userReview) {
		this.userReview = userReview;
	}
	public String getDateAndTime() {
		return dateAndTime;
	}
	public void setDateAndTime(String dateAndTime) {
		this.dateAndTime = dateAndTime;
	}
	public ProductOrdered getProductOrdered() {
		return productOrdered;
	}
	public void setProductOrdered(ProductOrdered productOrdered) {
		this.productOrdered = productOrdered;
	} 
}
