package com.drinksapi.repositories;

import org.springframework.data.repository.CrudRepository;

import com.drinksapi.models.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long>
{

}
