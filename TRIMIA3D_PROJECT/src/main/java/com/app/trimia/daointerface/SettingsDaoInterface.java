package com.app.trimia.daointerface;

import org.springframework.data.repository.CrudRepository;

import com.app.trimia.model.ProviderMaster;

public interface SettingsDaoInterface extends CrudRepository<ProviderMaster, String>{

<<<<<<< HEAD
	public ProviderMaster findAllByProviderMasterId(String id);
=======
	public ProviderMaster findAllByServiceProviderRegistrationId(String id);

>>>>>>> branch 'master' of https://github.com/GrvTakte/Trimia3D
}
