package com.app.trimia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.trimia.model.MaterialSpecializationCategory;
import com.app.trimia.model.MaterialSpecializationSubCategory;
import com.app.trimia.serviceinterface.SpecializationSubCategoryServiceInterface;

@RestController
public class RestDataController {	
	
	@Autowired
	SpecializationSubCategoryServiceInterface subCatService;
	
	@RequestMapping(value="/subCategory")
	private ResponseEntity<List<MaterialSpecializationSubCategory>> subCategory(@RequestParam String id){
		System.out.println(id);
		MaterialSpecializationCategory cat = new MaterialSpecializationCategory();
		cat.setSpecializationCategoryId(id);
		List<MaterialSpecializationSubCategory> list = subCatService.getAllSubCategory(cat);
		return new ResponseEntity<List<MaterialSpecializationSubCategory>>(list,HttpStatus.OK);
	}
	
}
