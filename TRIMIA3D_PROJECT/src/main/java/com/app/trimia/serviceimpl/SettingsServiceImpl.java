package com.app.trimia.serviceimpl;

import java.util.Optional;

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
		ProviderMaster master = settingdaoi.findAllByProviderMasterId(id);
		return master;
	}

}
