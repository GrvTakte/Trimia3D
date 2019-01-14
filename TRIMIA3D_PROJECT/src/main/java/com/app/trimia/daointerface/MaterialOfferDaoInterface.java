package com.app.trimia.daointerface;

import org.springframework.data.repository.CrudRepository;

import com.app.trimia.model.serviceprovider.MaterialSpecializationCategory;

public interface MaterialOfferDaoInterface extends CrudRepository<MaterialSpecializationCategory, String>{
	
}
