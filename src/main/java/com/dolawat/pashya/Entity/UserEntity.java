package com.dolawat.pashya.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "product")
public class UserEntity {
	
	@Id
	private long productID;
	@Column 
	private String name;
	
	public UserEntity(long id, String name) {
		super();
		this.productID = id;
		this.name = name;
	}
	public UserEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return productID;
	}
	public void setId(long id) {
		this.productID = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
