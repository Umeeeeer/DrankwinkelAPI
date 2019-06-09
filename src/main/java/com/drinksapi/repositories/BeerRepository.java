package com.drinksapi.repositories;

import org.springframework.data.repository.CrudRepository;

import com.drinksapi.models.Beer;

public interface BeerRepository extends CrudRepository<Beer, Long>
{
}
