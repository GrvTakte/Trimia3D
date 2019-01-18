package com.app.trimia.daointerface;

import org.springframework.data.repository.CrudRepository;

import com.app.trimia.model.ProviderCompanyMaster;


public interface ProviderCompanyMasterDaoInterface extends CrudRepository<ProviderCompanyMaster, String >{

	ProviderCompanyMaster findAllByProviderCompanyMasterId(String companyId);

	ProviderCompanyMaster findTopByOrderByProviderCompanyMasterIdDesc();

	

}
