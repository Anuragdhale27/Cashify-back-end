package com.dolawat.pashya.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dolawat.pashya.Entity.UserEntity;
import com.dolawat.pashya.repository.RepositoryInterface;
import com.dolawat.pashya.repository.RepositoryInterface;

@Service
public class ServiceImpl implements ServiceInterface {
	
	@Autowired
	private RepositoryInterface repository;
	//List <UserEntity> list; 
	
	public ServiceImpl() {
		//list  = new ArrayList<>();
		//list.add(new UserEntity(1,"java"));
	}
	
	public List<UserEntity> getCourse() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
