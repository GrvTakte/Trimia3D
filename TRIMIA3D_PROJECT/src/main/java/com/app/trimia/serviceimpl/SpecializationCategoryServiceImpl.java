package com.app.trimia.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.trimia.daointerface.SpecializationCategoryDaoInterface;
import com.app.trimia.model.MaterialSpecializationCategory;
import com.app.trimia.serviceinterface.SpecializationCategoryServiceInterface;

@Service
public class SpecializationCategoryServiceImpl implements SpecializationCategoryServiceInterface{
	
	@Autowired
	SpecializationCategoryDaoInterface categoryDao;
	
	@Override
	public List<MaterialSpecializationCategory> getAllCategory() {
		// TODO Auto-generated method stub
		List<MaterialSpecializationCategory> list = (List<MaterialSpecializationCategory>) categoryDao.findAll();
		return list;
	}
	
}
