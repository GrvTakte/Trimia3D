package com.app.trimia.model.manager;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class LoginDetail {

	@Id
	private String loginId;
	private String username;
	private String password;
	@OneToOne(cascade=CascadeType.MERGE)
	private RoleDetail roleDetail;
	
	public String getLoginId() {
		return loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public RoleDetail getRoleDetail() {
		return roleDetail;
	}
	public void setRoleDetail(RoleDetail roleDetail) {
		this.roleDetail = roleDetail;
	}
	
}
