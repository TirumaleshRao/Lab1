package com.jlc.Lab1.daos;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jlc.Lab1.entities.Customer;

@Repository
@Transactional
public interface CustomerRepo extends CrudRepository<Customer, Integer>{

}
