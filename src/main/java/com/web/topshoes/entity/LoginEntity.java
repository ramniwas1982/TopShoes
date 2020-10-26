package com.web.topshoes.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="login_tbl")
public class LoginEntity {

	@Id
	 @GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id;
	private String email;
	private String password;
	private String f_name;
	private String l_name;
	
	public String getL_name() {
		return l_name;
	}
	public void setL_name(String l_name) {
		this.l_name = l_name;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getF_name() {
		return f_name;
	}
	public void setF_name(String f_name) {
		this.f_name = f_name;
	}
	
	@Override
	public String toString() {
		return "LoginEntity [id=" + id + ", email=" + email + ", password=" + password + ", f_name=" + f_name + "]";
	}
	
		
	
	
	
}
