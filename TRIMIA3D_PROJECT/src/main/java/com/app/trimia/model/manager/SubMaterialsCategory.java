package com.app.trimia.model.manager;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


/**
 * @author Vijay Shinde
 * @role Manager
 * @Description to add mulitple categories for material and products
 * @whoUses userModule, serviceProviderModule, ManagerModule
 */

@Entity
public class SubMaterialsCategory{
	@Id
	private String subMaterialCategoryCode;
	private String subMaterialCategoryName;
	@ManyToOne(cascade=CascadeType.ALL)
	private MaterialsCategory materialsCategory;
	
	public String getSubMaterialCategoryCode() {
		return subMaterialCategoryCode;
	}
	public void setSubMaterialCategoryCode(String subMaterialCategoryCode) {
		this.subMaterialCategoryCode = subMaterialCategoryCode;
	}
	public String getSubMaterialCategoryName() {
		return subMaterialCategoryName;
	}
	public void setSubMaterialCategoryName(String subMaterialCategoryName) {
		this.subMaterialCategoryName = subMaterialCategoryName;
	}
	public MaterialsCategory getMaterialsCategory() {
		return materialsCategory;
	}
	public void setMaterialsCategory(MaterialsCategory materialsCategory) {
		this.materialsCategory = materialsCategory;
	}
	
}