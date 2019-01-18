package com.app.trimia.serviceinterface;

import java.util.List;

import com.app.trimia.model.ProviderCompanyMaster;

public interface ProviderCompanyMasterInterface {

	public void addNewCompany(ProviderCompanyMaster providerCompanyMaster);

	public List<ProviderCompanyMaster> viewCompanyList();

	public ProviderCompanyMaster viewCompanyById(String companyId);

	public void removeCompany(String companyId);

	

	

	

	

}
