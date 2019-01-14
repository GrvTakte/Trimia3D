package com.app.trimia.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class RestController {
	
	@RequestMapping("/viewProfile")
	public void viewProfile()
	{
		System.out.println("view profile called");
	}

}
