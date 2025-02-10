package com.cicosy.crm.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class LoyaltyPoints {
	
	@Id
	private Long id;
	private int points;

	
}
