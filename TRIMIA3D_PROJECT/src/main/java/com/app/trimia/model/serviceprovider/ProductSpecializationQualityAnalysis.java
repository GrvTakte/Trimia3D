package com.app.trimia.model.serviceprovider;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ProductSpecializationQualityAnalysis{

	@Id
    private String productSpecializationQualityAnalysisId;
    
	private String productSpecializationQualityAnalysisName;
    private String productSpecializationQualityAnalysisFileUrl;
    private String productSpecializationQualityAnalysisDescription;

    // Quotation reference;
    
}