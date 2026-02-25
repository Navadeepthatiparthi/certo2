package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.login;
@Repository
public interface login_repository extends JpaRepository<login, Long>{

	void deleteByEmail(String email);

	login findByEmail(String email);

}