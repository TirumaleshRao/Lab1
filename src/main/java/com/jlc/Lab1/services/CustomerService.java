package com.jlc.Lab1.services;

import java.util.List;

import com.jlc.Lab1.entities.Customer;

public interface CustomerService {
	public List<Customer> getAllCustomers();
	public Customer insert(Customer customer);
	public String delete(int cid);
}
