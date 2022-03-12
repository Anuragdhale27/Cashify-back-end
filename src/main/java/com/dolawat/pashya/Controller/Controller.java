package com.dolawat.pashya.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dolawat.pashya.Entity.UserEntity;
import com.dolawat.pashya.service.ServiceInterface;

@RestController
@CrossOrigin(origins = "*")
public class Controller {
	
	@Autowired
	private ServiceInterface service;
	
	@GetMapping(value = "/")
	public String getPage() {
		return "Welcome";
	}
	
	@GetMapping("/courses")
	public List<UserEntity> getData(){
		return this.service.getCourse();
	}
}
