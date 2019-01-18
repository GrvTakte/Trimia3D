package com.app.trimia.daointerface;

import org.springframework.data.repository.CrudRepository;

import com.app.trimia.model.CompanyMasterClient;

public interface ClientDaoInterface extends CrudRepository<CompanyMasterClient, String >{

	CompanyMasterClient findAllByClientId(String clientId);

}
