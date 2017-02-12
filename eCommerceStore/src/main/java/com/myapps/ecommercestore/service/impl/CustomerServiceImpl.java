package com.myapps.ecommercestore.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myapps.ecommercestore.domain.Customer;
import com.myapps.ecommercestore.domain.repository.CustomerRepository;
import com.myapps.ecommercestore.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerRepository customerRepository;
	
	
	public List<Customer> getAllCustomers() {
		
		return customerRepository.getAllCustomers();
	}

}
