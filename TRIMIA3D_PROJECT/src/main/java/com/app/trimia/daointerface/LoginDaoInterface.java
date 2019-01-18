package com.app.trimia.daointerface;

import org.springframework.data.repository.CrudRepository;

import com.app.trimia.model.Login;

public interface LoginDaoInterface extends CrudRepository<Login, String>{

	public Login findTopByOrderByLoginIdDesc();
	
	
}
