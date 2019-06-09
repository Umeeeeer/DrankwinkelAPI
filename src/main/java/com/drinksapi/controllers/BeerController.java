package com.drinksapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.drinksapi.models.Beer;
import com.drinksapi.services.BeerService;

@RestController
public class BeerController 
{
	@Autowired
	private BeerService beerService;
	
	@RequestMapping("/beers")
	public List<Beer> GetAllBeers()
	{
		return beerService.GetAllBeers();
	}
	
	@RequestMapping("/beers/{id}")
	public Beer GetBeerById(@PathVariable long id)
	{
		return beerService.GetBeerById(id);
	}
	
	@RequestMapping(value = "/beers", method = RequestMethod.PUT)
	public void UpdateBeer(@RequestBody Beer beer)
	{
		beerService.UpdateBeer(beer);
	}
	
	@RequestMapping(value = "/beers/{id}", method = RequestMethod.DELETE)
	public void DeleteBeerById(@PathVariable long id)
	{
		beerService.DeleteBeerById(id);
	}
	
	@RequestMapping(value = "/beers", method = RequestMethod.POST)
	public void AddBeer(@RequestBody Beer beer)
	{
		beerService.AddBeer(beer);
	}
}
