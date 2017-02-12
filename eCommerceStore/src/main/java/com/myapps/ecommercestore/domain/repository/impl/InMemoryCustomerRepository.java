package com.myapps.ecommercestore.domain.repository.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.myapps.ecommercestore.domain.Customer;
import com.myapps.ecommercestore.domain.repository.CustomerRepository;

@Repository
public class InMemoryCustomerRepository implements CustomerRepository{

    private List<Customer> listOfCustomers=new ArrayList<Customer> ();
	
    public InMemoryCustomerRepository(){
    	
    	Customer customer1=new Customer("Cus001","Abhi Singh");
    	
    	customer1.setAddress("Street11, New York, USA");
    	customer1.setNoOfOrdersMade(2);
    	
        Customer customer2=new Customer("Cus002","Savita Singh");
    	
    	customer2.setAddress("Street12, New York, USA");
    	customer2.setNoOfOrdersMade(4);
    	
    	listOfCustomers.add(customer1);
    	listOfCustomers.add(customer2);
    	
    	
    }
   
	
	public List<Customer> getAllCustomers() {
		
		return listOfCustomers;
	}

}
