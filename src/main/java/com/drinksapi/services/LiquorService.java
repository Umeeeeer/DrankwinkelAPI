package com.drinksapi.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.drinksapi.models.Liquor;
import com.drinksapi.repositories.LiquorRepository;

@Service
public class LiquorService 
{
	@Autowired
	private LiquorRepository liquorRepository;

	public List<Liquor> GetAllLiquors() 
	{
		List<Liquor> liquors = new ArrayList();
		
		liquorRepository.findAll().forEach(liquors::add);
		
		return liquors;
	}

	public Liquor GetLiquorById(long id) 
	{
		return liquorRepository.findById(id).get();
	}

	public void UpdateLiquor(Liquor liquor)
	{
		liquorRepository.save(liquor);
	}

	public void DeleteLiquorById(long id)
	{
		liquorRepository.deleteById(id);
	}

	public void AddLiquor(Liquor liquor) 
	{
		liquorRepository.save(liquor);
	}
}
