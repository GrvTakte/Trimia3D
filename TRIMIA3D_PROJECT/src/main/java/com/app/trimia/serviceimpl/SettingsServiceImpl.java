package com.app.trimia.serviceimpl;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.trimia.daointerface.SettingsDaoInterface;
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
	public ProviderMaster getProviderMasterByPass(String old) {
		ProviderMaster pm = settingdaoi.findAllByLogin_login_id(old);
		return null;
	}

	

	
}
