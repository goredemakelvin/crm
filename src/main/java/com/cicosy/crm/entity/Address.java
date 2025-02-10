package com.cicosy.crm.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class Address {

	private Long id;
	private String addressLine1;
	private String addressLine2;
	private String addressLine3;
	@ManyToOne
	private Contact contact;

}
