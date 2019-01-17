package com.app.trimia.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class MaterialDaimeter {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private float daimeter;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private SubMaterialsCategory subMaterialsCategory;
	
	public SubMaterialsCategory getSubMaterialsCategory() {
		return subMaterialsCategory;
	}

	public void setSubMaterialsCategory(SubMaterialsCategory subMaterialsCategory) {
		this.subMaterialsCategory = subMaterialsCategory;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getDaimeter() {
		return daimeter;
	}

	public void setDaimeter(float daimeter) {
		this.daimeter = daimeter;
	}

	

	
}
