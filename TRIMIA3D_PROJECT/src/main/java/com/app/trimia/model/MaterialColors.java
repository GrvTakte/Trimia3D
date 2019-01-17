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
public class MaterialColors {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int materialColorCode;
	private String materialColorName;
	private double price;
	@ManyToOne(cascade=CascadeType.ALL)
	private MaterialDaimeter materialDaimeter;


	public MaterialDaimeter getMaterialDaimeter() {
		return materialDaimeter;
	}
	public void setMaterialDaimeter(MaterialDaimeter materialDaimeter) {
		this.materialDaimeter = materialDaimeter;
	}
	public int getMaterialColorCode() {
		return materialColorCode;
	}
	public void setMaterialColorCode(int materialColorCode) {
		this.materialColorCode = materialColorCode;
	}
	public String getMaterialColorName() {
		return materialColorName;
	}
	public void setMaterialColorName(String materialColorName) {
		this.materialColorName = materialColorName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	/*public SubMaterialsCategory getSubMaterialsCategory() {
		return subMaterialsCategory;
	}
	public void setSubMaterialsCategory(SubMaterialsCategory subMaterialsCategory) {
		this.subMaterialsCategory = subMaterialsCategory;
	}*/
	
	
	
}