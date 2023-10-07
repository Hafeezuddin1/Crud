package com.coldchain.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.coldchain.model.Customers;
import com.coldchain.repository.CustomerRepository;
import com.coldchain.service.CustomerService;

@RestController


public class CustomerController {
	
	
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping(value="/customers", method = RequestMethod.GET)

	public List<Customers>findAll(){
		
		 List<Customers> Customerlist= customerService.getListCustomers();
		
		
		return Customerlist;
	}
	
	
	
	@RequestMapping(value="/customers", method = RequestMethod.POST)

	public Customers CreateCustomer(@RequestBody Customers cust){
		
		
		 Customers Customerlist= customerService.create(cust);
		
		
		return Customerlist;
	}
	@RequestMapping(value="/customers", method = RequestMethod.PUT)

	public Customers UpdateCustomer(@RequestBody Customers cust){
		
		
		 Customers Customerlist= customerService.create(cust);
		
		
		return Customerlist;
	}

}
