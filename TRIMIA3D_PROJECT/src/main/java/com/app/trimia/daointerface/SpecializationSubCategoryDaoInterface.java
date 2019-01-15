package com.app.trimia.daointerface;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.app.trimia.model.MaterialSpecializationCategory;
import com.app.trimia.model.MaterialSpecializationSubCategory;

public interface SpecializationSubCategoryDaoInterface extends CrudRepository<MaterialSpecializationSubCategory, String>{
	
	public List<MaterialSpecializationSubCategory> findAllByMaterialSpecializationCategory(MaterialSpecializationCategory id);
}
