package com.app.trimia.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class MaterialsDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int materialCode;
	private String materialDescription;
	private String materialImageUrlPath;
	private int materialDiscount;
	private double materialPrice;
	private int quantity;
	
	private String materialsCategory;
	
	private String subMaterialsCategory;
	
	private float materialDaimeter;
	

	public int getMaterialDiscount() {
		return materialDiscount;
	}
	public void setMaterialDiscount(int materialDiscount) {
		this.materialDiscount = materialDiscount;
	}
	public String getMaterialsCategory() {
		return materialsCategory;
	}
	public void setMaterialsCategory(String materialsCategory) {
		this.materialsCategory = materialsCategory;
	}
	public String getSubMaterialsCategory() {
		return subMaterialsCategory;
	}
	public void setSubMaterialsCategory(String subMaterialsCategory) {
		this.subMaterialsCategory = subMaterialsCategory;
	}
	
	public float getMaterialDaimeter() {
		return materialDaimeter;
	}
	public void setMaterialDaimeter(float materialDaimeter) {
		this.materialDaimeter = materialDaimeter;
	}

	@ManyToOne(cascade=CascadeType.MERGE)
	private MaterialColors materialColors;
	
	public MaterialColors getMaterialColors() {
		return materialColors;
	}
	public void setMaterialColors(MaterialColors materialColors) {
		this.materialColors = materialColors;
	}
	public int getMaterialCode() {
		return materialCode;
	}
	public void setMaterialCode(int materialCode) {
		this.materialCode = materialCode;
	}
	
	public String getMaterialDescription() {
		return materialDescription;
	}
	public void setMaterialDescription(String materialDescription) {
		this.materialDescription = materialDescription;
	}
	public String getMaterialImageUrlPath() {
		return materialImageUrlPath;
	}
	public void setMaterialImageUrlPath(String materialImageUrlPath) {
		this.materialImageUrlPath = materialImageUrlPath;
	}
	public double getMaterialPrice() {
		return materialPrice;
	}
	public void setMaterialPrice(double materialPrice) {
		this.materialPrice = materialPrice;
	}
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	
		
}

