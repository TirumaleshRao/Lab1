package com.jlc.Lab1.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jlc.Lab1.daos.CustomerRepo;
import com.jlc.Lab1.entities.Customer;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	CustomerRepo cr;
	
	@Override
	public List<Customer> getAllCustomers() {
		return (List<Customer>) cr.findAll();
	}

	@Override
	public Customer insert(Customer customer) {
		return cr.save(customer);
	}
	
	public String delete(int cid) {
		cr.deleteById(cid);
		return "deleted";
	}

}
