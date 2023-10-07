package com.coldchain.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coldchain.model.Customers;

import com.coldchain.repository.CustomerRepository;

@Service(value ="CustomerService")




public class CustomerService {
	@Autowired
	private CustomerRepository customerRepository;
	
	
	public List<Customers> getListCustomers(){
		
		//List<Customers> CustomerList=customerRepository.findAll();
		List<Customers> list = new ArrayList<>();
        customerRepository.findAll().iterator().forEachRemaining(list::add);
		return list;
		
		
		
	}
	
	public Customers create(Customers cust){
		
		Customers custs = customerRepository.save(cust);
				return custs;
		
	}
public Customers update(Customers cust){
		
		Customers custs = customerRepository.findById(cust.getId()).get();
		custs = cust;
				customerRepository.save(custs);
				return custs;
		
	}

}
