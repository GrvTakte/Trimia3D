package com.app.trimia.serviceinterface;

import java.util.List;

import com.app.trimia.model.MaterialSpecializationCategory;
import com.app.trimia.model.MaterialSpecializationSubCategory;

public interface SpecializationSubCategoryServiceInterface {

	public List<MaterialSpecializationSubCategory> getAllSubCategory(MaterialSpecializationCategory id);
	
}
