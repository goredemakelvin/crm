package com.cicosy.crm.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cicosy.crm.entity.Contact;

public interface ContactRepository  extends JpaRepository<Contact,Long>{

}
