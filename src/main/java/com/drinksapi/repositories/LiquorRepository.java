package com.drinksapi.repositories;

import org.springframework.data.repository.CrudRepository;

import com.drinksapi.models.Liquor;

public interface LiquorRepository extends CrudRepository<Liquor, Long>
{

}
