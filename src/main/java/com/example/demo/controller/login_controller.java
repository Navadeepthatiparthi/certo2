package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.login;
import com.example.demo.services.login_service;
@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
public class login_controller {
@Autowired
login_service service;
@PostMapping("/login")
public String add(@RequestBody login l) {
	return service.add(l);
}
@GetMapping("/logindatas")
public List<login>getall(){
	return service.getall();
}
@DeleteMapping("/login/{email}")
public String delete(@PathVariable String email) {
	return service.delete(email);
}
@GetMapping("/logindata/{email}")
public login getbyemail(@PathVariable String email) {
	return service.getbyemail(email);
}
@PutMapping("/loginupdate/{email}")
public String update(@RequestBody login l,@PathVariable String email) {
	return service.update(l, email);
}
@PostMapping("/logins")
public List<login>adddatas(@RequestBody List<login> l){
	return service.adddatas(l);
}
}
