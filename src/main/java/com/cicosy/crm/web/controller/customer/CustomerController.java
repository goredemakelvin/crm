package com.cicosy.crm.web.controller.customer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cicosy.crm.web.dto.CustomerDto;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	
	@PostMapping("/save")
	public String saveCustomer(@RequestBody CustomerDto customerDto) {
		return "";
	}
	
	@GetMapping("/")
	public String Customer() {
		return "";
	}
	
	@GetMapping("/list")
	public String list() {
		return "";
	}
	
	
	
	
}
