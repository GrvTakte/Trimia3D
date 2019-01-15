package com.app.trimia.serviceimpl;

<<<<<<< HEAD
import java.util.Optional;
=======
import java.util.List;
>>>>>>> branch 'master' of https://github.com/GrvTakte/Trimia3D

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.trimia.daointerface.SettingsDaoInterface;
import com.app.trimia.model.ProviderMaster;
import com.app.trimia.serviceinterface.SettingsServiceInterface;

@Service
public class SettingsServiceImpl implements SettingsServiceInterface{
	@Autowired
	SettingsDaoInterface settingdaoi;

	@Override
	public ProviderMaster getProviderMaster(String id) {
<<<<<<< HEAD
		ProviderMaster master = settingdaoi.findAllByProviderMasterId(id);
		return master;
=======
		ProviderMaster pm=(ProviderMaster) settingdaoi.findAllByServiceProviderRegistrationId(id);
		return pm;
>>>>>>> branch 'master' of https://github.com/GrvTakte/Trimia3D
	}

}
