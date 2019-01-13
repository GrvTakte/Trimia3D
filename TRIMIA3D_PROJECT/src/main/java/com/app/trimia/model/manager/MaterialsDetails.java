package com.app.trimia.model.manager;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * @author Prashant Shinde
 * @role Manager
 * @Description
 * @whoUses 
 */
@Entity
public class MaterialsDetails {

	@Id
	private String materialCode;
	private String materialName;
	private String materialDescription;
	private String materialImageUrlPath;
	private double materialPrice;
	@ManyToOne(cascade=CascadeType.MERGE)
	private MaterialsCategory materialsCategory;
	@ManyToOne(cascade=CascadeType.MERGE)
	private SubMaterialsCategory subMaterialsCategory;
	@ManyToOne(cascade=CascadeType.MERGE)
	private MaterialsCategory materialColors;
	public String getMaterialCode() {
		return materialCode;
	}
	public void setMaterialCode(String materialCode) {
		this.materialCode = materialCode;
	}
	public String getMaterialName() {
		return materialName;
	}
	public void setMaterialName(String materialName) {
		this.materialName = materialName;
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
	public MaterialsCategory getMaterialsCategory() {
		return materialsCategory;
	}
	public void setMaterialsCategory(MaterialsCategory materialsCategory) {
		this.materialsCategory = materialsCategory;
	}
	public SubMaterialsCategory getSubMaterialsCategory() {
		return subMaterialsCategory;
	}
	public void setSubMaterialsCategory(SubMaterialsCategory subMaterialsCategory) {
		this.subMaterialsCategory = subMaterialsCategory;
	}
	public MaterialsCategory getMaterialColors() {
		return materialColors;
	}
	public void setMaterialColors(MaterialsCategory materialColors) {
		this.materialColors = materialColors;
	}
		
}
