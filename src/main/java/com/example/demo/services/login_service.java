package com.example.demo.services;

import java.util.List;

import com.example.demo.models.login;

public interface login_service {
	public String add(login l); //to add single data
	public List<login>getall(); //to fetch multiple data
	public String delete(String email); //to delete single user
	public login getbyemail(String email); //to fetch single user
	public String update(login l,String email); //to update( by using specific item)
	public List<login>adddatas(List<login> l); //to add multiple data
}
