package com.example.demo.models;
import jakarta.persistence.CascadeType;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
@Entity
public class login {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Email
	private String email;
	@Size(min = 4, max = 15)
	private String password;
	private Boolean condition1;
	@OneToOne(cascade = CascadeType.ALL)
	private address address;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
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
	public Boolean getCondition1() {
		return condition1;
	}
	public void setCondition1(Boolean condition1) {
		this.condition1 = condition1;
	}
	public address getAddress() {
		return address;
	}
	public void setAddress(address address) {
		this.address = address;
	}
	public login(Long id, @Email String email, @Size(min = 4, max = 15) String password, Boolean condition1,
			com.example.demo.models.address address) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.condition1 = condition1;
		this.address = address;
	}
	public login() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}