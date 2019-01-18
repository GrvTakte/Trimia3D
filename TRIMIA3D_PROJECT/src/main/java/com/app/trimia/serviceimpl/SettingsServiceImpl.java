package com.app.trimia.serviceimpl;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.trimia.daointerface.SettingsDaoInterface;
import com.app.trimia.model.Login;
import com.app.trimia.model.ProviderMaster;
import com.app.trimia.serviceinterface.SettingsServiceInterface;

@Service
public class SettingsServiceImpl implements SettingsServiceInterface
{
	@Autowired
	SettingsDaoInterface settingdaoi;

	@Override
	public ProviderMaster getProviderMaster(String id) {
		ProviderMaster pm = settingdaoi.findAllByProviderMasterId(id);
		return pm;
	}

	@Override
	public ProviderMaster getProviderMasterByPass(Login login) {
		ProviderMaster pm = settingdaoi.findByLogin(login);
		return pm;
	}

	

	
}
