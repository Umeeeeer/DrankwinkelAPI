package com.drinksapi.services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.drinksapi.models.Customer;
import com.drinksapi.repositories.CustomerRepository;

@Service
public class CustomerService 
{
	@Autowired
	private CustomerRepository customerRepository;
	
	public List<Customer> GetAllCustomers() 
	{
		List<Customer> customers = new ArrayList();
		
		customerRepository.findAll().forEach(customers::add);
		
		return customers;
	}

	public Customer GetCustomerById(long id) 
	{
		return customerRepository.findById(id).get();
	}

	public void UpdateCustomer(Customer customer) 
	{
		customerRepository.save(customer);
	}

	public void DeleteCustomerById(long id) 
	{
		customerRepository.deleteById(id);
	}

	public void AddCustomer(Customer customer)
	{
		customerRepository.save(customer);
	}
}
