package com.cicosy.crm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cicosy.crm.entity.Customer;
import com.cicosy.crm.repo.CustomerRepository;

@Service
public class CustomerServiceImp  extends CustomerService{
	
	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public Customer save(Customer t) {
		// TODO Auto-generated method stub
		return customerRepository.save(t);
	}

}
