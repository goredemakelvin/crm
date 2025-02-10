package com.cicosy.crm.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Contact {
	@Id
	private Long id;
	@OneToMany
	private List<Address> addresses;
	@OneToMany
	private List<Phone> phoneNumbers;
	@OneToMany
	private List<EmailAddress> emailAddress;
	@ManyToOne
	private  Customer customer;
	
	

}
