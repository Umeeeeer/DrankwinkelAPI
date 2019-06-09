package com.drinksapi.config;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.drinksapi.models.Beer;
import com.drinksapi.models.Customer;
import com.drinksapi.models.Energydrink;
import com.drinksapi.models.Liquor;
import com.drinksapi.models.Order;
import com.drinksapi.repositories.BeerRepository;
import com.drinksapi.repositories.CustomerRepository;
import com.drinksapi.repositories.EnergydrinkRepository;
import com.drinksapi.repositories.LiquorRepository;
import com.drinksapi.repositories.OrderRepository;

@Component
public class DrinksApiApplicationRunner implements ApplicationRunner
{
	@Autowired
	private BeerRepository beerRepository;
	@Autowired
	private CustomerRepository customerRepository;
	@Autowired
	private EnergydrinkRepository energydrinkRepository;
	@Autowired
	private OrderRepository orderRepository;
	@Autowired
	private LiquorRepository liquorRepository;
	
	@Override
	public void run(ApplicationArguments args) throws Exception 
	{
		System.out.println("Runner gestart");
		Beer beer = new Beer();
		beer.setName("Beer1");
		beer.setAlcoholpercentage("1%");
		beer.setType("typename");
		beer.setCanbesoldtominors(true);
		
		Beer beer2 = new Beer();
		beer2.setName("Beer2");
		beer2.setAlcoholpercentage("2%");
		beer2.setType("typename2");
		beer2.setCanbesoldtominors(true);
		
		Beer beer3 = new Beer();
		beer3.setName("Beer3");
		beer3.setAlcoholpercentage("3%");
		beer3.setType("typename3");
		beer3.setCanbesoldtominors(true);
		
		Liquor liquor = new Liquor();
		liquor.setName("Liquor1");
		liquor.setAlcoholpercentage("20%");
		liquor.setType("typename");
		liquor.setCanbesoldtominors(false);
		
		Liquor liquor2 = new Liquor();
		liquor2.setName("Liquor2");
		liquor2.setAlcoholpercentage("30%");
		liquor2.setType("typename2");
		liquor2.setCanbesoldtominors(false);
		
		Liquor liquor3 = new Liquor();
		liquor3.setName("Liquor3");
		liquor3.setAlcoholpercentage("30%");
		liquor3.setType("typename3");
		liquor3.setCanbesoldtominors(false);
		
		Energydrink energydrink = new Energydrink();
		energydrink.setName("energydrink1");
		energydrink.setCanbesoldtominors(true);
		
		Energydrink energydrink2 = new Energydrink();
		energydrink2.setName("energydrink2");
		energydrink2.setCanbesoldtominors(true);
		
		Energydrink energydrink3 = new Energydrink();
		energydrink3.setName("energydrink3");
		energydrink3.setCanbesoldtominors(true);
		
		Order order = new Order();
		order.setPrice((long) 200);
		List<Energydrink> energydrinks = new ArrayList();
		energydrinks.add(energydrink);
		energydrinks.add(energydrink3);
		order.setEnergydrinks(energydrinks);
		List<Beer> beers = new ArrayList();
		beers.add(beer3);
		order.setBeers(beers);
		
		Order order2 = new Order();
		order2.setPrice((long) 300);
		List<Liquor> liquors = new ArrayList();
		liquors.add(liquor2);
		liquors.add(liquor);
		order2.setLiquors(liquors);
		
		Customer customer = new Customer();
		customer.setAge(18);
		customer.setEthnicity("Asian");
		customer.setName("Ching chong");
		List<Order> orders = new ArrayList();
		orders.add(order);
		customer.setOrders(orders);
		
		Customer customer2 = new Customer();
		customer2.setAge(59);
		customer2.setEthnicity("Middle eastern");
		customer2.setName("Hassan Mohammed");
		List<Order> orders2 = new ArrayList();
		orders2.add(order2);
		customer2.setOrders(orders2);
		
		customerRepository.save(customer);
		customerRepository.save(customer2);
	}
}
