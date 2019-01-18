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
<<<<<<< HEAD
		List<CompanyMasterClient> client_list=(List<CompanyMasterClient>) clientDao.findAll();
		return client_list;
	}

	@Override
	public void deleteClient(String clientId) {
		System.out.println("in del()"+clientId);
		clientDao.deleteById(clientId);
		
	}

	@Override
	public CompanyMasterClient editClient(String clientId) {
		//CompanyMasterClient client=clientDao.findById(clientId);
		CompanyMasterClient client=clientDao.findAllByClientId(clientId);	
		return client;
	}

	@Override
	public void updateClient(CompanyMasterClient client) {
		clientDao.save(client);
		
	}

	
=======
		// TODO Auto-generated method stub
		return null;
	}

>>>>>>> branch 'master' of https://github.com/GrvTakte/Trimia3D
}
