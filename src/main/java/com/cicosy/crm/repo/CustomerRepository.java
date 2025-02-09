package com.cicosy.crm.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cicosy.crm.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
