package com.app.trimia.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.trimia.daointerface.MaterialOfferDaoInterface;
import com.app.trimia.model.MaterialSpecializationCategory;
import com.app.trimia.serviceinterface.MaterialOfferServiceInterface;

@Service
public class MaterialOfferServiceInterfaceImpl implements MaterialOfferServiceInterface{

	@Autowired
	MaterialOfferDaoInterface offerDao;
	
	@Override
	public List<MaterialSpecializationCategory> loadCategory() {
		return null;
	}
	
}
