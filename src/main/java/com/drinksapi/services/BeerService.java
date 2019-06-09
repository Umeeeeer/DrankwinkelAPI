package com.drinksapi.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.drinksapi.models.Beer;
import com.drinksapi.repositories.BeerRepository;

@Service
public class BeerService
{
	@Autowired
	private BeerRepository beerRepository;

	public List<Beer> GetAllBeers() 
	{
		List<Beer> beers = new ArrayList();
		
		beerRepository.findAll().forEach(beers::add);
		
		return beers;
	}

	public Beer GetBeerById(long id) 
	{
		return beerRepository.findById(id).get();
	}

	public void UpdateBeer(Beer beer) 
	{
		beerRepository.save(beer);
	}

	public void DeleteBeerById(long id) 
	{
		beerRepository.deleteById(id);
	}

	public void AddBeer(Beer beer)
	{
		beerRepository.save(beer);
	}
}
