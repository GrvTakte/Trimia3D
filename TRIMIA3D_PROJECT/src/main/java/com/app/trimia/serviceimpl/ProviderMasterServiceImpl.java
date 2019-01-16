package com.app.trimia.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.trimia.daointerface.ProviderMasterDaoInterface;
import com.app.trimia.model.ProviderMaster;
import com.app.trimia.serviceinterface.ProviderMasterServiceInterface;

@Service
public class ProviderMasterServiceImpl implements ProviderMasterServiceInterface{

	@Autowired
	ProviderMasterDaoInterface masterDao;
	
	@Override
	public void registerProvider(ProviderMaster master) {
		/*ProviderMaster master1 = masterDao.findTopByOrderByProviderMasterIdDesc();
		String id = master1.getProviderMasterId();
		String str = id.substring(2, id.length());
		int id1 = Integer.parseInt(str);
		id1++;
		String generatedId = "SP"+id1;*/
		//master.setProviderMasterId("SP002");
		//System.out.println(generatedId);
		masterDao.save(master);
	}
	
}
