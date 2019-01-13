package com.app.trimia.model.manager;

import javax.persistence.Entity;
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
	private String materialCategoryCode;
	private String materialCategoryName;
	
	public String getMaterialCategoryCode() {
		return materialCategoryCode;
	}
	public void setMaterialCategoryCode(String materialCategoryCode) {
		this.materialCategoryCode = materialCategoryCode;
	}
	public String getMaterialCategoryName() {
		return materialCategoryName;
	}
	public void setMaterialCategoryName(String materialCategoryName) {
		this.materialCategoryName = materialCategoryName;
	}
	
	
}