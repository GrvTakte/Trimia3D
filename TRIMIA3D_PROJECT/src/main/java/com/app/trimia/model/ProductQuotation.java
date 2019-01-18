package com.app.trimia.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
<<<<<<< HEAD
public class ProductQuotation
{
=======
public class ProductQuotation {
>>>>>>> branch 'master' of https://github.com/GrvTakte/Trimia3D
	@Id
<<<<<<< HEAD
   private String id;
   private String fileUrl;
   private String orderDate;
   private String orderTime;
   private String address;
   private String selectMaterial;
   
   private String quatationDate;
   private String workingHours;
   private String status;
   private String remark;
   private String finalCost;
   private String expectedDate;
	
	@OneToOne(cascade=CascadeType.ALL)
	private ProviderCompanyMaster providerCompanyMaster;
	
	@OneToOne(cascade=CascadeType.ALL)
   private UserRegister userRegister;
=======
	private String id;
	private String fileUrl;
	private String orderDate;
	private String orderTime;
	private String address;
	private String selectMaterial;
>>>>>>> branch 'master' of https://github.com/GrvTakte/Trimia3D

<<<<<<< HEAD
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

	public String getQuatationDate() {
		return quatationDate;
	}

	public void setQuatationDate(String quatationDate) {
		this.quatationDate = quatationDate;
	}

	public String getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(String workingHours) {
		this.workingHours = workingHours;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getFinalCost() {
		return finalCost;
	}

	public void setFinalCost(String finalCost) {
		this.finalCost = finalCost;
	}

	public String getExpectedDate() {
		return expectedDate;
	}

	public void setExpectedDate(String expectedDate) {
		this.expectedDate = expectedDate;
	}

	public ProviderCompanyMaster getProviderCompanyMaster() {
		return providerCompanyMaster;
	}

	public void setProviderCompanyMaster(ProviderCompanyMaster providerCompanyMaster) {
		this.providerCompanyMaster = providerCompanyMaster;
	}

	public UserRegister getUserRegister() {
		return userRegister;
	}

	public void setUserRegister(UserRegister userRegister) {
		this.userRegister = userRegister;
	}
	
	
}
=======
	private String quatationDate;
	private String workingHours;
	private String status;
	private String remark;
	private String finalCost;
	private String expectedDate;

	@OneToOne(cascade = CascadeType.ALL)
	private ProviderCompanyMaster providerCompanyMaster;

	@OneToOne(cascade = CascadeType.ALL)
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

	public String getQuatationDate() {
		return quatationDate;
	}

	public void setQuatationDate(String quatationDate) {
		this.quatationDate = quatationDate;
	}

	public String getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(String workingHours) {
		this.workingHours = workingHours;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getFinalCost() {
		return finalCost;
	}

	public void setFinalCost(String finalCost) {
		this.finalCost = finalCost;
	}

	public String getExpectedDate() {
		return expectedDate;
	}

	public void setExpectedDate(String expectedDate) {
		this.expectedDate = expectedDate;
	}

	public ProviderCompanyMaster getProviderCompanyMaster() {
		return providerCompanyMaster;
	}

	public void setProviderCompanyMaster(ProviderCompanyMaster providerCompanyMaster) {
		this.providerCompanyMaster = providerCompanyMaster;
	}

	public UserRegister getUserRegister() {
		return userRegister;
	}

	public void setUserRegister(UserRegister userRegister) {
		this.userRegister = userRegister;
	}

}
>>>>>>> branch 'master' of https://github.com/GrvTakte/Trimia3D
