package com.app.trimia.model.serviceprovider;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="productQuotation")
public class ProductQuotation
{
	@Id
   private String id;
   private String fileUrl;
   private String orderDate;
   private String orderTime;
   private String address;
   private String selectMaterial;
	
	@OneToOne(cascade=CascadeType.ALL)
   private ProviderCompanyMaster companyMaster;
	
	@OneToOne(cascade=CascadeType.ALL)
   private UserRegister userRegister;

public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getFileUrl() {
	return fileUrl;
}
public void setFileUrl(String fileUrl) {
	this.fileUrl = fileUrl;
}
public String getOrderDate() {
	return orderDate;
}
public void setOrderDate(String orderDate) {
	this.orderDate = orderDate;
}
public String getOrderTime() {
	return orderTime;
}
public void setOrderTime(String orderTime) {
	this.orderTime = orderTime;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getSelectMaterial() {
	return selectMaterial;
}
public void setSelectMaterial(String selectMaterial) {
	this.selectMaterial = selectMaterial;
}
public UserRegister getUserRegister() {
	return userRegister;
}
public void setUserRegister(UserRegister userRegister) {
	this.userRegister = userRegister;
}
   
   
   
   
   
}
