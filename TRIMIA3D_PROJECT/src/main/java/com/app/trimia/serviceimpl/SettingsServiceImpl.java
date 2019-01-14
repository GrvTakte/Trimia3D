package com.app.trimia.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.app.trimia.daointerface.SettingsDaoInterface;
import com.app.trimia.model.ProviderMaster;
import com.app.trimia.serviceinterface.SettingsServiceInterface;

public class SettingsServiceImpl implements SettingsServiceInterface{
	@Autowired
	SettingsDaoInterface settingdaoi;

	@Override
	public ProviderMaster getProviderMaster() {
		ProviderMaster pm=(ProviderMaster)settingdaoi.findAll();
		return pm;
	}

}
