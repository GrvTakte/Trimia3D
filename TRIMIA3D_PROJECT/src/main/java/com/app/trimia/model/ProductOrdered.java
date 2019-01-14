package com.app.trimia.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="productOrdered")
public class ProductOrdered {
	
	@Id
	private String orderId;
	
	private String fileUrl;
	private String orderDate;
	private String orderTime;
	private String completionDate;
	
	@OneToOne(cascade=CascadeType.ALL)
	private MaterialSpecializationSubCategory materialSpecializationSubCategory;

	@ManyToOne(cascade=CascadeType.ALL)
	private ProviderCompanyMaster providerCompanyMaster;

	/*@ManyToOne(cascade=CascadeType.ALL)
	private UserRegistration userRegistration;*/

	@OneToOne(cascade=CascadeType.ALL, mappedBy="productOrdered")
	private CompanyMasterFeedback companyMasterFeedback;

	//vishal
	//private OrderCommission orderCommission;
	
	@OneToOne(cascade=CascadeType.ALL, mappedBy="productOrdered")
	private ProductOrderTracking productOrderTracking;

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getFileUrl() {
		return fileUrl;
	}

	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public String getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
	}

	public String getCompletionDate() {
		return completionDate;
	}

	public void setCompletionDate(String completionDate) {
		this.completionDate = completionDate;
	}

	public MaterialSpecializationSubCategory getMaterialSpecializationSubCategory() {
		return materialSpecializationSubCategory;
	}

	public void setMaterialSpecializationSubCategory(MaterialSpecializationSubCategory materialSpecializationSubCategory) {
		this.materialSpecializationSubCategory = materialSpecializationSubCategory;
	}

	public ProviderCompanyMaster getProviderCompanyMaster() {
		return providerCompanyMaster;
	}

	public void setProviderCompanyMaster(ProviderCompanyMaster providerCompanyMaster) {
		this.providerCompanyMaster = providerCompanyMaster;
	}

	public CompanyMasterFeedback getCompanyMasterFeedback() {
		return companyMasterFeedback;
	}

	public void setCompanyMasterFeedback(CompanyMasterFeedback companyMasterFeedback) {
		this.companyMasterFeedback = companyMasterFeedback;
	}

	public ProductOrderTracking getProductOrderTracking() {
		return productOrderTracking;
	}

	public void setProductOrderTracking(ProductOrderTracking productOrderTracking) {
		this.productOrderTracking = productOrderTracking;
	}

	/*@OneToOne(cascade=CascadeType.ALL, mappedBy="productOrdered")
	private ProductPaymentStatus productPaymentStatus;*/
	
	
}