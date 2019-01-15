package com.app.trimia.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.trimia.daointerface.SpecializationSubCategoryDaoInterface;
import com.app.trimia.model.MaterialSpecializationCategory;
import com.app.trimia.model.MaterialSpecializationSubCategory;
import com.app.trimia.serviceinterface.SpecializationSubCategoryServiceInterface;

@Service
public class SpecializationSubCategoryServiceImpl implements SpecializationSubCategoryServiceInterface{

	@Autowired
	SpecializationSubCategoryDaoInterface subCategoryDao;
	
	@Override
	public List<MaterialSpecializationSubCategory> getAllSubCategory(MaterialSpecializationCategory id) {
		List<MaterialSpecializationSubCategory> list = (List<MaterialSpecializationSubCategory>) subCategoryDao.findAllByMaterialSpecializationCategory(id);
		return list;
	}
	
}
