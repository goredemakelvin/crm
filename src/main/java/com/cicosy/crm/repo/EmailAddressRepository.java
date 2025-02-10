package com.cicosy.crm.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cicosy.crm.entity.EmailAddress;

public interface EmailAddressRepository  extends JpaRepository<EmailAddress, Long>{

}
