package com.app.trimia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String dashboard()
	{
		System.out.println("Grv Task");
		System.out.println("priyanka task");
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
		System.out.println("hello dear all");
		System.out.println("Low Level Task");
		System.out.println("productOrdered");
		System.out.println("highlevel task");
		return "/serviceProviderPages/productOrdered";
	}
	
	@RequestMapping("/offer")
	public String offer()
	{
		System.out.println("offer");
		return "/serviceProviderPages/offer";
	}
	
	@RequestMapping("/setting")
	public String setting()
	{
		System.out.println("setting");
		return "/serviceProviderPages/setting";
	}
	
	@RequestMapping("/specialization")
	public String specialization()
	{
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
	
	@RequestMapping("/companies")
	public String companies()
	{
		System.out.println("companies");
		return "/serviceProviderPages/company";
	}
	
	@RequestMapping("/AdminPaymentStatus")
	public String AdminPaymentStatus()
	{
		System.out.println("AdminPaymentStatus");
		return "/serviceProviderPages/AdminPaymentStatus";
	}
}
