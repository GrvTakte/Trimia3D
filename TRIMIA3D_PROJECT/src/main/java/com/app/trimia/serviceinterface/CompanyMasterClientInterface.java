package com.app.trimia.serviceinterface;

import java.util.List;

import com.app.trimia.model.CompanyMasterClient;
import com.app.trimia.model.Feedback;

public interface CompanyMasterClientInterface {

	public void addClient(CompanyMasterClient companyMasterClient);

	public List<CompanyMasterClient> viewAllClient();

	

}
