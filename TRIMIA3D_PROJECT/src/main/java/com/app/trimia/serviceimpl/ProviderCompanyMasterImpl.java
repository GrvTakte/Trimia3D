package com.app.trimia.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.trimia.daointerface.ProviderCompanyMasterDaoInterface;
import com.app.trimia.model.ProviderCompanyMaster;
import com.app.trimia.serviceinterface.ProviderCompanyMasterInterface;
import com.app.trimia.util.IdAutoGenerate;

@Service
public class ProviderCompanyMasterImpl implements ProviderCompanyMasterInterface {

	@Autowired
	ProviderCompanyMasterDaoInterface companyDao;
	
	//@Autowired
	//IdAutoGenerate autoGenerate;
	IdAutoGenerate autoGenerate=new IdAutoGenerate();
	
	@Override
	public void addNewCompany(ProviderCompanyMaster providerCompanyMaster) {
		System.out.println("add company impl");
		ProviderCompanyMaster comapanyMaster1 = companyDao.findTopByOrderByProviderCompanyMasterIdDesc();
		System.out.println("nhvnhvnhvnhv"+comapanyMaster1.getProviderCompanyMasterId());
		String companyId=autoGenerate.generateId(comapanyMaster1.getProviderCompanyMasterId());
		providerCompanyMaster.setProviderCompanyMasterId(companyId);
		System.out.println(companyId);
		System.out.println(providerCompanyMaster.getProviderCompanyMasterId());
		companyDao.save(providerCompanyMaster);
	}


	@Override
	public List<ProviderCompanyMaster> viewCompanyList() {
		System.out.println("ser impl view");
		List<ProviderCompanyMaster> company_list =(List<ProviderCompanyMaster>) companyDao.findAll();
		System.out.println("s--impl "+company_list);
		return company_list;
	}


	@Override
	public ProviderCompanyMaster viewCompanyById(String companyId) {
		ProviderCompanyMaster company =companyDao.findAllByProviderCompanyMasterId(companyId);
		System.out.println(company );
		return company ;
	}


	@Override
	public void removeCompany(String companyId) {
		System.out.println("remove impl");
		companyDao.deleteById(companyId);
		
	}


	

}
