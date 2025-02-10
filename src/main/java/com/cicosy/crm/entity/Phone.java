package com.cicosy.crm.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class Phone {
	
	private Long id;
	private String phoneNumber;
	private boolean active;
	@ManyToOne
	private Contact contact;
}
