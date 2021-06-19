package com.jlc.Lab1.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jlc.Lab1.entities.Customer;
import com.jlc.Lab1.services.CustomerService;

@RestController
public class AppController {
	
	@Autowired
	CustomerService cs;
	
	@GetMapping("/getAll")
	public List<Customer> getAllCustomers(){
		return cs.getAllCustomers();
	}
	
	@PostMapping("/customersave")
	public Customer saveCustomer(@RequestBody Customer customer) {
		return cs.insert(customer);
	}
	
	@DeleteMapping("/customerdelete/{cid}")
	public String deleteCustomer(@PathVariable int cid) {
		return cs.delete(cid);
	}
}
