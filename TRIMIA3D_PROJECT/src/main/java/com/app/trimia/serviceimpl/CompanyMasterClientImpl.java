package com.app.trimia.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.trimia.daointerface.ClientDaoInterface;
import com.app.trimia.model.CompanyMasterClient;
import com.app.trimia.serviceinterface.CompanyMasterClientInterface;

@Service
public class CompanyMasterClientImpl implements CompanyMasterClientInterface{

	@Autowired 
	ClientDaoInterface clientDao;
	
	@Override
	public void addClient(CompanyMasterClient companyMasterClient) {
		clientDao.save(companyMasterClient);
	}

	@Override
	public List<CompanyMasterClient> viewAllClient() {
		// TODO Auto-generated method stub
		return null;
	}

}
