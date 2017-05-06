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
    	
    	Customer customer1=new Customer("Cus001","Abhishek Singh");
    	
    	customer1.setAddress("House-01, Street11, New York, USA");
    	customer1.setNoOfOrdersMade(3);
    	customer1.setEmail("abhisingh@gmail.com");
    	customer1.setMobile("852779087");
    	
        Customer customer2=new Customer("Cus002","Manoj Kumar Singh");
    	
    	customer2.setAddress("House-02, Street11, New York, USA");
    	customer2.setNoOfOrdersMade(6);
    	customer2.setEmail("mksingh@gmail.com");
    	customer2.setMobile("852798368");
    	
    	Customer customer3=new Customer("Cus003","Savita Singh");
    	
    	customer3.setAddress("House-02, Street11, New York, USA");
    	customer3.setNoOfOrdersMade(9);
    	customer3.setEmail("savitasingh@gmail.com");
    	customer3.setMobile("852798377");
    	
       
        Customer customer4=new Customer("Cus004","Abhijeet Singh");
    	
    	customer4.setAddress("House-03, Street11, New York, USA");
    	customer4.setNoOfOrdersMade(7);
    	customer4.setEmail("abhijeetsingh@gmail.com");
    	customer4.setMobile("852798943");
    	
    	listOfCustomers.add(customer1);
    	listOfCustomers.add(customer2);
    	listOfCustomers.add(customer3);
    	listOfCustomers.add(customer4);
    	
    	
    }
   
	
	public List<Customer> getAllCustomers() {
		
		return listOfCustomers;
	}

}
