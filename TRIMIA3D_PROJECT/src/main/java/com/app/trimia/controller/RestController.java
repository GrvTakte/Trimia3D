package com.app.trimia.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.trimia.model.ProviderMaster;

@Controller
public class RestController {
	
	@RequestMapping("/viewProfile")
	public void viewProfile()
	{
		System.out.println("view profile called");
	}

}
