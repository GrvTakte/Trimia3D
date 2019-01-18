package com.app.trimia.model;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int subMaterialCategoryCode;
	private String subMaterialCategoryName;
	@ManyToOne(cascade=CascadeType.ALL)
	private MaterialsCategory materialsCategory;
	public int getSubMaterialCategoryCode() {
		return subMaterialCategoryCode;
	}
	public void setSubMaterialCategoryCode(int subMaterialCategoryCode) {
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