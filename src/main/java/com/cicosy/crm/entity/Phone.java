package com.cicosy.crm.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Phone {
	
	@Id
	private Long id;
	private String phoneNumber;
	private boolean active;
	@ManyToOne
	private Contact contact;
}
