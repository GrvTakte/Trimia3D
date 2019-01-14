package com.app.trimia.model.serviceprovider;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="materialSpecializationCategory")
public class MaterialSpecializationCategory 
{
	@Id
	private String specializationCategoryId;
	
	private String specializationCategoryName;
	
	public String getSpecializationCategoryId() {
		return specializationCategoryId;
	}
	public void setSpecializationCategoryId(String specializationCategoryId) {
		this.specializationCategoryId = specializationCategoryId;
	}
	public String getSpecializationCategoryName() {
		return specializationCategoryName;
	}
	public void setSpecializationCategoryName(String specializationCategoryName) {
		this.specializationCategoryName = specializationCategoryName;
	}
}