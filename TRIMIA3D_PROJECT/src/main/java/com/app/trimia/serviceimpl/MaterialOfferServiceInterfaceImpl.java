package com.app.trimia.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.app.trimia.daointerface.MaterialOfferDaoInterface;
import com.app.trimia.model.serviceprovider.MaterialSpecializationCategory;
import com.app.trimia.serviceinterface.MaterialOfferServiceInterface;

public class MaterialOfferServiceInterfaceImpl implements MaterialOfferServiceInterface{

	
	
	@Override
	public List<MaterialSpecializationCategory> loadCategory() {
		return null;
	}
	
}
