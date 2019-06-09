package com.drinksapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.drinksapi.models.Beer;
import com.drinksapi.models.Energydrink;
import com.drinksapi.services.EnergydrinkService;

@RestController
public class EnergydrinkController
{
	@Autowired
	private EnergydrinkService energydrinkService;
	
	@RequestMapping("/energydrinks")
	public List<Energydrink> GetAllEnergydrinks()
	{
		return energydrinkService.GetAllEnergydrinks();
	}
	
	@RequestMapping("/energydrinks/{id}")
	public Energydrink GetEnergydrinkById(@PathVariable long id)
	{
		return energydrinkService.GetEnergydrinkById(id);
	}
	
	@RequestMapping(value = "/energydrinks", method = RequestMethod.PUT)
	public void UpdateEnergydrink(@RequestBody Energydrink energydrink)
	{
		energydrinkService.UpdateEnergydrink(energydrink);
	}
	
	@RequestMapping(value = "/energydrinks/{id}", method = RequestMethod.DELETE)
	public void DeleteEnergydrinkById(@PathVariable long id)
	{
		energydrinkService.DeleteEnergydrinkById(id);
	}
	
	@RequestMapping(value = "/energydrinks", method = RequestMethod.POST)
	public void AddEnergydrink(@RequestBody Energydrink energydrink)
	{
		energydrinkService.AddEnergydrink(energydrink);
	}
}
