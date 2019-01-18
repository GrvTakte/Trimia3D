package com.app.trimia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.trimia.model.Login;

import com.app.trimia.model.Feedback;

import com.app.trimia.model.MaterialSpecializationCategory;
import com.app.trimia.model.ProductQuotation;
import com.app.trimia.model.ProviderMaster;

import com.app.trimia.serviceinterface.ProviderMasterServiceInterface;

import com.app.trimia.serviceinterface.FeedbackInterface;
import com.app.trimia.serviceinterface.ProductQautationSeviceInterface;
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
<<<<<<< HEAD
	
=======

>>>>>>> branch 'master' of https://github.com/GrvTakte/Trimia3D
	@Autowired
	FeedbackInterface feedbackservice;

	@Autowired
	ProductQautationSeviceInterface quatationService;  
	
	@RequestMapping("/")
	public String dashboard()
	{
		System.out.println("dashboard");
		return "/serviceProviderPages/dashboard";
	}
	
	@RequestMapping("/login")
	public String loginPage()
	{
		System.out.println("Login Page");
		return "/serviceProviderPages/login";
	}
	
	
	@RequestMapping(value="/log",method=RequestMethod.POST)
	public String loginServiceProvider(@RequestParam String email,@RequestParam String password)
	{
		System.out.println(email);
		System.out.println(password);
		if(email.equals("service@gmail.com") && password.equals("Service123") )
		{
			return "/serviceProviderPages/dashboard";
		}
		else
		{
			return "/serviceProviderPages/login";	
		}
		
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
	public String productQA(ModelMap map)
	{
		System.out.println("productQA");
		
		List<ProductQuotation> qlist=quatationService.productQA();
		map.addAttribute("quatation",qlist);
		return "/serviceProviderPages/productQA";
	}
	
	
	@RequestMapping("/addQuatation")
	public String addQuatation(@ModelAttribute ProductQuotation pQuatation)
	{
		System.out.println("Add Quatation");
		quatationService.addQuatation(pQuatation);
		return "/serviceProviderPages/dashboard";
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
	
	//-------Author: Priyanka  Date:16/1/18
	@RequestMapping("/feedback")
	public String feedback(ModelMap map)
	{
		System.out.println("feedback");
		List<Feedback> flist=feedbackservice.getFeedback();
		map.addAttribute("feedback", flist);
		System.out.println("in controller "+flist);
		
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
<<<<<<< HEAD
	
	@RequestMapping("/updateSettings")
	public String updateSettings()
	{
		System.out.println("updateSettings called");
		return "/serviceProviderPages/setting";
	}
	
	@RequestMapping("/resetPassword")
	public String resetPassword()
	{
		System.out.println("resetPassword called");
		return "/serviceProviderPages/resetPassword";
	}
=======
	
	@RequestMapping("/register")
	public String displayRegister() {
		return "/serviceProviderPages/register";
	}
	
	@RequestMapping("/register1")
	public String registerProvider(@ModelAttribute ProviderMaster master, @ModelAttribute Login login) {
		login.setEmail(master.getProviderMasterEmail());
		master.setLogin(login);
		//master.setProviderMasterId("SP002");
		System.out.println(login.getEmail()+" "+login.getPassword());
		masterService.registerProvider(master);
		return "/serviceProviderPages/login";
<<<<<<< HEAD
	}
	
	
	
=======
	}
>>>>>>> branch 'master' of https://github.com/GrvTakte/Trimia3D
>>>>>>> branch 'master' of https://github.com/GrvTakte/Trimia3D
}
