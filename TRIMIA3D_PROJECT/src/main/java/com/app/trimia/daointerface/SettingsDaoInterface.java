package com.app.trimia.daointerface;

import org.springframework.data.repository.CrudRepository;

import com.app.trimia.model.ProviderMaster;

public interface SettingsDaoInterface extends CrudRepository<ProviderMaster, String>{

	public ProviderMaster findAllByProviderMasterId(String old);

	public ProviderMaster findAllByLogin_login_id(String old);
}
