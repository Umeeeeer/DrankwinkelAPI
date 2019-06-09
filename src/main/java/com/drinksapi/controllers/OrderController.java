package com.drinksapi.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.drinksapi.models.Order;
import com.drinksapi.services.OrderService;

@RestController
public class OrderController
{
	@Autowired
	private OrderService orderService;
	
	@RequestMapping("/orders")
	public List<Order> GetAllOrders()
	{
		return orderService.GetAllOrders();
	}
	
	@RequestMapping("/orders/{id}")
	public Order GetOrderById(@PathVariable long id)
	{
		return orderService.GetOrderById(id);
	}
	
	@RequestMapping(value = "/orders", method = RequestMethod.PUT)
	public void UpdateOrder(@RequestBody Order order)
	{
		orderService.UpdateOrder(order);
	}
	
	@RequestMapping(value = "/orders/{id}", method = RequestMethod.DELETE)
	public void DeleteOrderById(@PathVariable long id)
	{
		orderService.DeleteOrderById(id);
	}
	
	@RequestMapping(value = "/orders", method = RequestMethod.POST)
	public void AddOrder(@RequestBody Order order)
	{
		orderService.AddOrder(order);
	}
}
