package com.app.trimia.model.serviceprovider;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MaterialSpecializationCategory 
{
	@Id
	private String specializationCategoryId;
	
	private String specializationCategoryName;
	private String specializationCategoryColor;
}