package com.cicosy.crm.entity;

import jakarta.persistence.Entity;

@Entity
public class Customer {

	private Long id;
	private String employeeNumber;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmployeeNumber() {
		return employeeNumber;
	}
	public void setEmployeeNumber(String employeeNumber) {
		this.employeeNumber = employeeNumber;
	}
	
	
	
}
