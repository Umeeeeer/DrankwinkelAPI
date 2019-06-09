package com.drinksapi.services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.drinksapi.models.Order;
import com.drinksapi.repositories.OrderRepository;

@Service
public class OrderService 
{
	@Autowired
	private OrderRepository orderRepository;

	public List<Order> GetAllOrders() 
	{
		List<Order> orders = new ArrayList();
		
		orderRepository.findAll().forEach(orders::add);
		
		return orders;
	}

	public Order GetOrderById(long id) 
	{
		return orderRepository.findById(id).get();
	}

	public void UpdateOrder(Order order) 
	{
		orderRepository.save(order);
	}

	public void DeleteOrderById(long id) 
	{
		orderRepository.deleteById(id);
	}

	public void AddOrder(Order order) 
	{
		orderRepository.save(order);
	}
}
