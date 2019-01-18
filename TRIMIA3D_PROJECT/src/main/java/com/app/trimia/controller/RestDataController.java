package com.app.trimia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.trimia.model.CompanyMasterClient;
import com.app.trimia.model.MaterialSpecializationCategory;
import com.app.trimia.model.MaterialSpecializationSubCategory;
import com.app.trimia.model.ProviderCompanyMaster;
import com.app.trimia.serviceinterface.CompanyMasterClientInterface;
import com.app.trimia.serviceinterface.ProviderCompanyMasterInterface;
import com.app.trimia.serviceinterface.SpecializationSubCategoryServiceInterface;

@RestController
public class RestDataController {	
	
	@Autowired
	SpecializationSubCategoryServiceInterface subCatService;
	
	@Autowired
	CompanyMasterClientInterface clientService;
	
	@Autowired
	ProviderCompanyMasterInterface companyMasterService;
	
	@RequestMapping(value="/subCategory")
	private ResponseEntity<List<MaterialSpecializationSubCategory>> subCategory(@RequestParam String id){
		
		System.out.println(id);
		MaterialSpecializationCategory cat = new MaterialSpecializationCategory();
		cat.setSpecializationCategoryId(id);
		List<MaterialSpecializationSubCategory> list = subCatService.getAllSubCategory(cat);
		return new ResponseEntity<List<MaterialSpecializationSubCategory>>(list,HttpStatus.OK);
	}
	
	@RequestMapping(value="/addClient")
	public ResponseEntity<CompanyMasterClient> addClient(@RequestParam String clientId, @RequestParam String clientName)
	{
		
		System.out.println("in add client");
		CompanyMasterClient client=new CompanyMasterClient();
		client.setClientId(clientId);
		client.setClientName(clientName);
		clientService.addClient(client);
		return new ResponseEntity<CompanyMasterClient>(HttpStatus.OK);
		
	}
	
	@RequestMapping(value="/viewClient") 
	public ResponseEntity<List<CompanyMasterClient>> viewAllClient(){
		System.out.println(" in view client");
		List<CompanyMasterClient> client_list=clientService.viewAllClient();
		return new ResponseEntity<List<CompanyMasterClient>>(client_list, HttpStatus.OK);
		
	}
	
	@RequestMapping(value="/deleteClient") 
	public ResponseEntity<CompanyMasterClient> deleteClient(@RequestParam String clientId){
		System.out.println(" in delete client");
		clientService.deleteClient(clientId);
		return new ResponseEntity<CompanyMasterClient>(HttpStatus.OK);
		
	}
	
	@RequestMapping(value="/editClient") 
	public ResponseEntity<CompanyMasterClient> editClient(@RequestParam String clientId){
		System.out.println(" in edit client");
		CompanyMasterClient client=clientService.editClient(clientId);
		return new ResponseEntity<CompanyMasterClient>(client, HttpStatus.OK);
		
	}
	
	@RequestMapping(value="/updateClinet")
	public ResponseEntity<CompanyMasterClient> updateClient(@RequestParam String clientId, @RequestParam String clientName)
	{
		System.out.println("in update client");
		CompanyMasterClient client=new CompanyMasterClient();
		client.setClientId(clientId);
		client.setClientName(clientName);
		clientService.updateClient(client);
		return new ResponseEntity<CompanyMasterClient>(HttpStatus.OK) ;
		
	}
	
	
	@RequestMapping(value="/viewCompanyList",method=RequestMethod.POST)
	public ResponseEntity<List<ProviderCompanyMaster>> viewCompanyList()
	{
		System.out.println("view Company List");
		List<ProviderCompanyMaster> company_list=companyMasterService.viewCompanyList();
		System.out.println("hiiii");
		System.out.println("kjhkjh"+company_list);
		return new ResponseEntity<List<ProviderCompanyMaster>>(company_list,HttpStatus.OK);		
	}
	
	@RequestMapping(value="/viewCompanyById") 
	public ResponseEntity<ProviderCompanyMaster> viewCompanyById(@RequestParam String companyId){
		System.out.println(" in view company");
		ProviderCompanyMaster company=companyMasterService.viewCompanyById(companyId);
		return new ResponseEntity<ProviderCompanyMaster>(company,HttpStatus.OK);
		
	}
	
	@RequestMapping(value="/removeCompany") 
	public ResponseEntity<ProviderCompanyMaster> removeCompany(@RequestParam String companyId){
		System.out.println(" in remove company");
		companyMasterService.removeCompany(companyId);
		return new ResponseEntity<ProviderCompanyMaster>(HttpStatus.OK);
		
	}
	


}
