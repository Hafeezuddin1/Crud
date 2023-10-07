package com.coldchain.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.coldchain.model.Customers;

@Repository

public interface CustomerRepository extends CrudRepository<Customers,Integer> {
	
	
	

}
