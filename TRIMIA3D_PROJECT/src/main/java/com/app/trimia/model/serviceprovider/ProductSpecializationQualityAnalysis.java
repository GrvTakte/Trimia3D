package com.app.trimia.model.serviceprovider;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="productSpecializationQualityAnalysis")
public class ProductSpecializationQualityAnalysis{

	@Id
    private String productSpecializationQualityAnalysisId;
    
	private String productSpecializationQualityAnalysisName;
    private String productSpecializationQualityAnalysisFileUrl;
    private String productSpecializationQualityAnalysisDescription;

    
    @OneToOne(cascade=CascadeType.ALL)
    ProductQuotation productQuotation;


	public String getProductSpecializationQualityAnalysisId() {
		return productSpecializationQualityAnalysisId;
	}


	public void setProductSpecializationQualityAnalysisId(String productSpecializationQualityAnalysisId) {
		this.productSpecializationQualityAnalysisId = productSpecializationQualityAnalysisId;
	}


	public String getProductSpecializationQualityAnalysisName() {
		return productSpecializationQualityAnalysisName;
	}


	public void setProductSpecializationQualityAnalysisName(String productSpecializationQualityAnalysisName) {
		this.productSpecializationQualityAnalysisName = productSpecializationQualityAnalysisName;
	}


	public String getProductSpecializationQualityAnalysisFileUrl() {
		return productSpecializationQualityAnalysisFileUrl;
	}


	public void setProductSpecializationQualityAnalysisFileUrl(String productSpecializationQualityAnalysisFileUrl) {
		this.productSpecializationQualityAnalysisFileUrl = productSpecializationQualityAnalysisFileUrl;
	}


	public String getProductSpecializationQualityAnalysisDescription() {
		return productSpecializationQualityAnalysisDescription;
	}


	public void setProductSpecializationQualityAnalysisDescription(String productSpecializationQualityAnalysisDescription) {
		this.productSpecializationQualityAnalysisDescription = productSpecializationQualityAnalysisDescription;
	}


	public ProductQuotation getProductQuotation() {
		return productQuotation;
	}


	public void setProductQuotation(ProductQuotation productQuotation) {
		this.productQuotation = productQuotation;
	}
    
    
    
}