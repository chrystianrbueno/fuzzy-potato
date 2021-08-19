package com.example.accessingdatajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerRestController {

	@Autowired
	private CustomerRepository repository;

	@GetMapping("/api/customers")
	public Iterable<Customer> getCustomers() {
		Iterable<Customer> lista = repository.findAll(); 
		return lista; 
	}	
}
