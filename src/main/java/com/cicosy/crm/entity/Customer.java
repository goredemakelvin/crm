package com.cicosy.crm.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Customer {

	@Id
	private Long id;
	
	private String customerNumber;
	
	@OneToOne
	private Contact contact;
	@OneToOne
	private LoyaltyPoints loyaltyPoints;
	
	

	
	
	
	
	
}
