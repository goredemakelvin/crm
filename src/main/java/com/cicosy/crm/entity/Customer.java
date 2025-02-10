package com.cicosy.crm.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;

@Entity
public class Customer {

	private Long id;
	
	private String customerNumber;
	
	@OneToOne
	private Contact contact;
	@OneToOne
	private LoyaltyPoints loyaltyPoints;
	
	

	
	
	
	
	
}
