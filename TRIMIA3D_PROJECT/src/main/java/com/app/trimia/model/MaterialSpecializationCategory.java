package com.app.trimia.model;

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
	private String specializationCategoryColor;
	
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
	public String getSpecializationCategoryColor() {
		return specializationCategoryColor;
	}
	public void setSpecializationCategoryColor(String specializationCategoryColor) {
		this.specializationCategoryColor = specializationCategoryColor;
	}	
}