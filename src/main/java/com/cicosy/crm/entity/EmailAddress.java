package com.cicosy.crm.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class EmailAddress {
	
    @Id
	private Long id;
	private String email;
	private boolean enabled;
	@ManyToOne
	private Contact contact;
}
