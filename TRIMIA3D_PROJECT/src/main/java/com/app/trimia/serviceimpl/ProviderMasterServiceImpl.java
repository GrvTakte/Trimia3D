package com.app.trimia.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.trimia.daointerface.LoginDaoInterface;
import com.app.trimia.daointerface.ProviderMasterDaoInterface;
import com.app.trimia.model.Login;
import com.app.trimia.model.ProviderMaster;
import com.app.trimia.serviceinterface.ProviderMasterServiceInterface;
import com.app.trimia.util.IdAutoGenerate;

@Service
public class ProviderMasterServiceImpl implements ProviderMasterServiceInterface{
	IdAutoGenerate autoGenerate = new IdAutoGenerate();
	
	@Autowired
	ProviderMasterDaoInterface masterDao;
	
	@Autowired
	LoginDaoInterface loginDao;
	
	@Override
	public void registerProvider(ProviderMaster master) {
		ProviderMaster master1 = masterDao.findTopByOrderByProviderMasterIdDesc();
		Login login = loginDao.findTopByOrderByLoginIdDesc();
		String LoginId = autoGenerate.generateId(login.getLoginId());
		String ProviderId = autoGenerate.generateId(master1.getProviderMasterId());
		master.getLogin().setLoginId(LoginId);
		master.setProviderMasterId(ProviderId);
		masterDao.save(master);
	}
	
}
