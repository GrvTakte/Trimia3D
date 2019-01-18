package com.app.trimia.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="productOrdered")
public class ProductOrdered {
	
	@Id
	private String productOrderedId;
	
	private String productOrderedFileUrl;
	private String productOrderedDate;
	private String productOrderedTime;
	private String productOrderedcompletionDate;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="materialSpecializationSubCategory")
	private MaterialSpecializationSubCategory materialSpecializationSubCategory;

	@ManyToOne(cascade=CascadeType.ALL)
	private UserRegister userRegister;

	@OneToOne(cascade=CascadeType.ALL, mappedBy="productOrdered")
	private Feedback feedback;
	
	@OneToOne(cascade=CascadeType.ALL, mappedBy="productOrdered")
	private ProductOrderTracking productOrderTracking;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private ProviderCompanyMaster providerCompanyMaster;
	
	public String getProductOrderedId() {
		return productOrderedId;
	}

	public void setProductOrderedId(String productOrderedId) {
		this.productOrderedId = productOrderedId;
	}

	public String getProductOrderedFileUrl() {
		return productOrderedFileUrl;
	}

	public void setProductOrderedFileUrl(String productOrderedFileUrl) {
		this.productOrderedFileUrl = productOrderedFileUrl;
	}

	public String getProductOrderedDate() {
		return productOrderedDate;
	}

	public void setProductOrderedDate(String productOrderedDate) {
		this.productOrderedDate = productOrderedDate;
	}

	public String getProductOrderedTime() {
		return productOrderedTime;
	}

	public void setProductOrderedTime(String productOrderedTime) {
		this.productOrderedTime = productOrderedTime;
	}

	public String getProductOrderedcompletionDate() {
		return productOrderedcompletionDate;
	}

	public void setProductOrderedcompletionDate(String productOrderedcompletionDate) {
		this.productOrderedcompletionDate = productOrderedcompletionDate;
	}

	public UserRegister getUserRegister() {
		return userRegister;
	}

	public void setUserRegister(UserRegister userRegister) {
		this.userRegister = userRegister;
	}

	public MaterialSpecializationSubCategory getMaterialSpecializationSubCategory() {
		return materialSpecializationSubCategory;
	}

	public void setMaterialSpecializationSubCategory(MaterialSpecializationSubCategory materialSpecializationSubCategory) {
		this.materialSpecializationSubCategory = materialSpecializationSubCategory;
	}

	
	public Feedback getFeedback() {
		return feedback;
	}

	public void setFeedback(Feedback feedback) {
		this.feedback = feedback;
	}

	public ProductOrderTracking getProductOrderTracking() {
		return productOrderTracking;
	}

	public void setProductOrderTracking(ProductOrderTracking productOrderTracking) {
		this.productOrderTracking = productOrderTracking;
	}
	
}