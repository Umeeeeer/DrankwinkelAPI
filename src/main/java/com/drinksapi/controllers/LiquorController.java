package com.drinksapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.drinksapi.models.Beer;
import com.drinksapi.models.Liquor;
import com.drinksapi.services.LiquorService;

@RestController
public class LiquorController 
{
	@Autowired
	private LiquorService liquorService;
	
	@RequestMapping("/liquors")
	public List<Liquor> GetAllLiquors()
	{
		return liquorService.GetAllLiquors();
	}
	
	@RequestMapping("/liquors/{id}")
	public Liquor GetLiquorById(@PathVariable long id)
	{
		return liquorService.GetLiquorById(id);
	}
	
	@RequestMapping(value = "/liquors", method = RequestMethod.PUT)
	public void UpdateLiquor(@RequestBody Liquor liquor)
	{
		liquorService.UpdateLiquor(liquor);
	}
	
	@RequestMapping(value = "/liquors/{id}", method = RequestMethod.DELETE)
	public void DeleteLiquorById(@PathVariable long id)
	{
		liquorService.DeleteLiquorById(id);
	}
	
	@RequestMapping(value = "/liquors", method = RequestMethod.POST)
	public void AddLiquor(@RequestBody Liquor liquor)
	{
		liquorService.AddLiquor(liquor);
	}
}
