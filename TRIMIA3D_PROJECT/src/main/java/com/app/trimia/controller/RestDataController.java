package com.app.trimia.controller;

import java.io.File;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.trimia.model.CompanyMasterClient;
import com.app.trimia.model.Login;
import com.app.trimia.model.MaterialSpecializationCategory;
<<<<<<< HEAD
import com.app.trimia.model.MaterialSpecializationSubCategory;
=======
import com.app.trimia.model.MaterialSpecializationSubCategory;
<<<<<<< HEAD
import com.app.trimia.model.ProviderCompanyMaster;
=======
<<<<<<< HEAD
>>>>>>> branch 'master' of https://github.com/GrvTakte/Trimia3D
import com.app.trimia.model.ProviderMaster;
<<<<<<< HEAD
import com.app.trimia.serviceinterface.SettingsServiceInterface;
import com.app.trimia.serviceinterface.CompanyMasterClientInterface;
=======
import com.app.trimia.serviceinterface.SettingsServiceInterface;
=======
>>>>>>> branch 'master' of https://github.com/GrvTakte/Trimia3D
import com.app.trimia.serviceinterface.CompanyMasterClientInterface;
<<<<<<< HEAD
import com.app.trimia.serviceinterface.ProviderCompanyMasterInterface;
=======
>>>>>>> branch 'master' of https://github.com/GrvTakte/Trimia3D
>>>>>>> branch 'master' of https://github.com/GrvTakte/Trimia3D
>>>>>>> branch 'master' of https://github.com/GrvTakte/Trimia3D
import com.app.trimia.serviceinterface.SpecializationSubCategoryServiceInterface;

@RestController
public class RestDataController {
	
	@Autowired
	SpecializationSubCategoryServiceInterface subCatService;
	
	@Autowired
	SettingsServiceInterface settingsservicei;
	
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
<<<<<<< HEAD
	}
=======
	}
	
<<<<<<< HEAD
	@RequestMapping(value="/addClient")
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> branch 'master' of https://github.com/GrvTakte/Trimia3D
	
	@RequestMapping(value="/checkOldPass",method=RequestMethod.POST)
	private ResponseEntity<ProviderMaster> checkOldPass(@RequestParam String id,@RequestParam String old)
	{
		System.out.println("checkOldPass called");
		System.out.println(id+"  "+old);
		Login login = new Login();
		login.setPassword(old);
		ProviderMaster pm=settingsservicei.getProviderMasterByPass(login);
		System.out.println(pm.getLogin().getPassword());
		return new ResponseEntity<ProviderMaster>(pm, HttpStatus.OK);
		
	}
<<<<<<< HEAD
	
=======
	
=======
>>>>>>> branch 'master' of https://github.com/GrvTakte/Trimia3D
>>>>>>> branch 'master' of https://github.com/GrvTakte/Trimia3D
	@RequestMapping("/addClient")
>>>>>>> branch 'master' of https://github.com/GrvTakte/Trimia3D
	public ResponseEntity<CompanyMasterClient> addClient(@RequestParam String clientId, @RequestParam String clientName)
	{
		
		System.out.println("in add client");
		System.out.println(clientId+" "+clientName);
		CompanyMasterClient client=new CompanyMasterClient();
		client.setCompanyMasterClientId(clientId);
		client.setCompanyMasterClientName(clientName);
		clientService.addClient(client);
		return new ResponseEntity<CompanyMasterClient>(HttpStatus.OK);
	}
	
<<<<<<< HEAD
=======
<<<<<<< HEAD
	@RequestMapping(value="/viewClient") 
=======
<<<<<<< HEAD
	


=======
	@RequestMapping("/uploadFile")
	public ResponseEntity<String> uploadFile(HttpServletResponse response, HttpServletRequest request){
		System.out.println("upload File Started");
		return new ResponseEntity<String>("File Uploaded Successfully",HttpStatus.OK);
	}
	
>>>>>>> branch 'master' of https://github.com/GrvTakte/Trimia3D
	@RequestMapping("/viewClient")
>>>>>>> branch 'master' of https://github.com/GrvTakte/Trimia3D
	public ResponseEntity<List<CompanyMasterClient>> viewAllClient(){
		System.out.println(" in view client");
		List<CompanyMasterClient> client_list=clientService.viewAllClient();
<<<<<<< HEAD
		return new ResponseEntity<List<CompanyMasterClient>>(client_list, HttpStatus.OK);
		
=======
		return new ResponseEntity<List<CompanyMasterClient>>(client_list,HttpStatus.OK);
>>>>>>> branch 'master' of https://github.com/GrvTakte/Trimia3D
	}
<<<<<<< HEAD
	
	@RequestMapping("/saveSpecialization")
	public ResponseEntity<String> saveSpecialization(){
		
		return new ResponseEntity<String>(HttpStatus.OK);
	}
=======
<<<<<<< HEAD
	
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
	


=======
>>>>>>> branch 'master' of https://github.com/GrvTakte/Trimia3D
>>>>>>> branch 'master' of https://github.com/GrvTakte/Trimia3D
>>>>>>> branch 'master' of https://github.com/GrvTakte/Trimia3D
>>>>>>> branch 'master' of https://github.com/GrvTakte/Trimia3D
}
