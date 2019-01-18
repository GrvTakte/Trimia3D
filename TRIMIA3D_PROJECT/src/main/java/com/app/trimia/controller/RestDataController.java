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
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.trimia.model.CompanyMasterClient;
import com.app.trimia.model.Login;
import com.app.trimia.model.MaterialSpecializationCategory;
import com.app.trimia.model.MaterialSpecializationSubCategory;
import com.app.trimia.model.ProviderMaster;
import com.app.trimia.serviceinterface.SettingsServiceInterface;
import com.app.trimia.serviceinterface.CompanyMasterClientInterface;
import com.app.trimia.serviceinterface.SpecializationSubCategoryServiceInterface;

@RestController
public class RestDataController {
	
	@Autowired
	SpecializationSubCategoryServiceInterface subCatService;
	
	@Autowired
	SettingsServiceInterface settingsservicei;
	
	@Autowired
	CompanyMasterClientInterface clientService;
	
	@RequestMapping(value="/subCategory")
	private ResponseEntity<List<MaterialSpecializationSubCategory>> subCategory(@RequestParam String id){
		
		System.out.println(id);
		MaterialSpecializationCategory cat = new MaterialSpecializationCategory();
		cat.setSpecializationCategoryId(id);
		List<MaterialSpecializationSubCategory> list = subCatService.getAllSubCategory(cat);
		return new ResponseEntity<List<MaterialSpecializationSubCategory>>(list,HttpStatus.OK);
	}
	
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
	
	@RequestMapping("/addClient")
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
	
	@RequestMapping("/viewClient")
	public ResponseEntity<List<CompanyMasterClient>> viewAllClient(){
		System.out.println(" in view clint");
		List<CompanyMasterClient> client_list=clientService.viewAllClient();
		return new ResponseEntity<List<CompanyMasterClient>>(client_list,HttpStatus.OK);
	}
	
	@RequestMapping("/saveSpecialization")
	public ResponseEntity<String> saveSpecialization(){
		
		return new ResponseEntity<String>(HttpStatus.OK);
	}
}
