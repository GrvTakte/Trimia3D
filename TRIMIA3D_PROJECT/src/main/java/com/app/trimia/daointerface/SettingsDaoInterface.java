package com.app.trimia.daointerface;

import org.springframework.data.repository.CrudRepository;

import com.app.trimia.model.Login;
import com.app.trimia.model.ProviderMaster;

public interface SettingsDaoInterface extends CrudRepository<ProviderMaster, String>{

	public ProviderMaster findAllByProviderMasterId(String old);
	
	public ProviderMaster findByLogin(Login login);
}
