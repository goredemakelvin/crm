package com.cicosy.crm.entity;

import jakarta.persistence.Entity;

@Entity
public class Customer {

	private Long id;
	private String customerNumber;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCustomerNumber() {
		return customerNumber;
	}
	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}
	
	
	
	
	
}
