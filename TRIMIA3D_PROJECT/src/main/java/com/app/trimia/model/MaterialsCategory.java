package com.app.trimia.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Vijay Shinde
 * @role Manager
 * @Description to add mulitple categories for material and products
 * @whoUses userModule, serviceProviderModule, ManagerModule
 */
@Entity
public class MaterialsCategory{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int materialCategoryCode;
	private String materialCategoryName;
	
	public int getMaterialCategoryCode() {
		return materialCategoryCode;
	}
	public void setMaterialCategoryCode(int materialCategoryCode) {
		this.materialCategoryCode = materialCategoryCode;
	}
	public String getMaterialCategoryName() {
		return materialCategoryName;
	}
	public void setMaterialCategoryName(String materialCategoryName) {
		this.materialCategoryName = materialCategoryName;
	}
	
	
}