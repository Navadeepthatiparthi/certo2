package com.example.demo.services.implimentation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.login;
import com.example.demo.repository.login_repository;
import com.example.demo.services.login_service;

import jakarta.transaction.Transactional;
@Service
public class loginserviceimplimentation implements login_service {
	@Autowired
	login_repository repo;
	@Override
	public String add(login l) {
		repo.save(l);
		return "sucessfully added";
	}

	@Override
	public List<login> getall() {
		return repo.findAll();
	}
	@Transactional
	@Override
	public String delete(String email) {
		repo.deleteByEmail(email);
		return "succesfully deleted"+email;
	}

	@Override
	public login getbyemail(String email) {
		
		return repo.findByEmail(email);
	}

	@Override
	public String update(login l, String email) {
	login l1 = repo.findByEmail(email);
		l1.setEmail(l.getEmail());
		l1.setPassword(l.getPassword());
		l1.setAddress(l.getAddress());
		repo.save(l1);
		return "succesfully updated";
	}

	@Override
	public List<login> adddatas(List<login> l) {
		
		return repo.saveAll(l);
	}

}
