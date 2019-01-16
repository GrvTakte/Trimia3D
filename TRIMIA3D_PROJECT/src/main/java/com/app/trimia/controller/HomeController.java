package com.app.trimia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.trimia.model.Address;
import com.app.trimia.model.Login;
import com.app.trimia.model.MaterialSpecializationCategory;
import com.app.trimia.model.ProviderMaster;
import com.app.trimia.serviceinterface.ProviderMasterServiceInterface;
import com.app.trimia.serviceinterface.SettingsServiceInterface;
import com.app.trimia.serviceinterface.SpecializationCategoryServiceInterface;

@Controller
public class HomeController {
	
	@Autowired
	SettingsServiceInterface settingsservicei;
	
	@Autowired
	SpecializationCategoryServiceInterface categoryService;
	
	@Autowired
	ProviderMasterServiceInterface masterService;
	

	@RequestMapping("/")
	public String dashboard()
	{
		System.out.println("dashboard");
		return "/serviceProviderPages/dashboard";
	}
	
	@RequestMapping("/dashboard")
	public String home()
	{
		System.out.println("dashboard");
		return "/serviceProviderPages/dashboard";
	}
	
	@RequestMapping("/client")
	public String client()
	{
		System.out.println("client");
		return "/serviceProviderPages/client";
	}
	
	@RequestMapping("/productOrdered")
	public String productOrdered()
	{
		System.out.println("productOrdered");
		return "/serviceProviderPages/productOrdered";
	}
	
	@RequestMapping("/offer")
	public String offer(ModelMap map)
	{
		System.out.println("offer");
		List<MaterialSpecializationCategory> list = categoryService.getAllCategory();
		map.addAttribute("category", list);
		System.out.println(list);		
		return "/serviceProviderPages/offer";
	}
	
	@RequestMapping("/setting")
	public String setting(ModelMap map)
	{
		System.out.println("setting");
		ProviderMaster pm=(ProviderMaster)settingsservicei.getProviderMaster("SP001");
		System.out.println(pm);
		//Address add = pm.getAddress().get(arg0)
		//Address address=  (Address) pm.getAddress();
		//Address address=addList.get(0);
		map.addAttribute("pm", pm);
		//map.addAttribute("add", add);
		//map.addAttribute("address", address);
		return "/serviceProviderPages/setting";
	}
	
	@RequestMapping("/specialization")
	public String specialization(ModelMap map)
	{
		List<MaterialSpecializationCategory> list = categoryService.getAllCategory();
		map.addAttribute("category", list);
		System.out.println(list);
		System.out.println("specialization");
		return "/serviceProviderPages/specialization";
	}
	
	@RequestMapping("/productQA")
	public String productQA()
	{
		System.out.println("productQA");
		return "/serviceProviderPages/productQA";
	}
	
	@RequestMapping("/orderTracking")
	public String orderTracking()
	{
		System.out.println("orderTracking");
		return "/serviceProviderPages/orderTracking";
	}
	
	@RequestMapping("/adminPaymentStatus")
	public String adminPaymentStatus()
	{
		System.out.println("adminPaymentStatus");
		return "/serviceProviderPages/adminPaymentStatus";
	}
	
	@RequestMapping("/materialsAndOffer")
	public String materialsAndOffer()
	{
		System.out.println("materialsAndOffer");
		return "/serviceProviderPages/material";
	}
	
	@RequestMapping("/feedback")
	public String feedback()
	{
		System.out.println("feedback");
		return "/serviceProviderPages/feedback";
	}
	
	@RequestMapping("/addCompany")
	public String companies()
	{
		System.out.println("add company");
		return "/serviceProviderPages/addCompany";
	}
	
	@RequestMapping("/viewCompany")
	public String viewcompanies()
	{
		System.out.println("view company");
		return "/serviceProviderPages/viewCompany";
	}
	
	@RequestMapping("/AdminPaymentStatus")
	public String AdminPaymentStatus()
	{
		System.out.println("AdminPaymentStatus");
		return "/serviceProviderPages/AdminPaymentStatus";
	}
	
	@RequestMapping("/register")
	public String displayRegister() {
		return "/serviceProviderPages/register";
	}
	
	@RequestMapping("/register1")
	public String registerProvider(@ModelAttribute ProviderMaster master, @ModelAttribute Login login) {
		login.setEmail(master.getProviderMasterEmail());
		login.setLoginId("LG002");
		master.setLogin(login);
		master.setProviderMasterId("SP002");
		System.out.println(login.getEmail()+" "+login.getPassword());
		masterService.registerProvider(master);
		return "/serviceProviderPages/login";
	}
}
