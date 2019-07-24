package com.pluralsight.repository;

import java.util.ArrayList;
import java.util.List;

import com.pluralsight.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRespository {

	@Override
	public List<Customer> findAll()
	{
		List<Customer> customers=new ArrayList<>();
		
		Customer c=new Customer();
		
		c.setFirstname("Md");
		c.setLastname("Azhar");
		
		c.setFirstname("Zayn");
		c.setLastname("Mallick");
		
		customers.add(c);
		
		return customers;
		
	}
	
}
