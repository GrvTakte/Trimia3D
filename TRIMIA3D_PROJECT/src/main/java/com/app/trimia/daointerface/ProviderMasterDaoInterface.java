package com.app.trimia.daointerface;

import org.springframework.data.repository.CrudRepository;

import com.app.trimia.model.ProviderMaster;

public interface ProviderMasterDaoInterface extends CrudRepository<ProviderMaster, String>{
	public ProviderMaster findTopByOrderByProviderMasterIdDesc();
}
