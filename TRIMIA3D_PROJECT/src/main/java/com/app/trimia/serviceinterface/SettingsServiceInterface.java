package com.app.trimia.serviceinterface;

import java.util.List;

import com.app.trimia.model.Address;
import com.app.trimia.model.ProviderMaster;

public interface SettingsServiceInterface {

	public ProviderMaster getProviderMaster(String id);

	public ProviderMaster getProviderMasterByPass(String old);

	

}
