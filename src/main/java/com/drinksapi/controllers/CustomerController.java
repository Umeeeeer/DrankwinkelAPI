package com.drinksapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.drinksapi.models.Customer;
import com.drinksapi.services.CustomerService;

@RestController
public class CustomerController
{
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping("/customers")
	public List<Customer> GetAllCustomers()
	{
		return customerService.GetAllCustomers();
	}
	
	@RequestMapping("/customers/{id}")
	public Customer GetCustomerById(@PathVariable long id)
	{
		return customerService.GetCustomerById(id);
	}
	
	@RequestMapping(value = "/customers", method = RequestMethod.PUT)
	public void UpdateCustomer(@RequestBody Customer customer)
	{
		customerService.UpdateCustomer(customer);
	}
	
	@RequestMapping(value = "/customers/{id}", method = RequestMethod.DELETE)
	public void DeleteCustomerById(@PathVariable long id)
	{
		customerService.DeleteCustomerById(id);
	}
	
	@RequestMapping(value = "/customers/{name}", method = RequestMethod.POST)
	public void AddCustomer(@PathVariable String name)
	{
		Customer customer = new Customer();
		customer.setName(name);
		customer.setAge(20);
		customer.setEthnicity("Middle eastern");
		customerService.AddCustomer(customer);
	}
}
