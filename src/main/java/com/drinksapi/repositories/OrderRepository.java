package com.drinksapi.repositories;

import org.springframework.data.repository.CrudRepository;

import com.drinksapi.models.Order;

public interface OrderRepository extends CrudRepository<Order, Long>
{

}
