package com.app.trimia.serviceinterface;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.app.trimia.model.MaterialSpecializationCategory;

public interface SpecializationCategoryServiceInterface{

	public List<MaterialSpecializationCategory> getAllCategory();
	
}
