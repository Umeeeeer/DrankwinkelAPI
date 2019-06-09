package com.drinksapi.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.drinksapi.models.Energydrink;
import com.drinksapi.repositories.EnergydrinkRepository;

@Service
public class EnergydrinkService 
{
	@Autowired
	private EnergydrinkRepository energydrinkRepository;

	public List<Energydrink> GetAllEnergydrinks()
	{
		List<Energydrink> energydrinks = new ArrayList();
		
		energydrinkRepository.findAll().forEach(energydrinks::add);
		
		return energydrinks;
	}

	public Energydrink GetEnergydrinkById(long id) 
	{
		return energydrinkRepository.findById(id).get();
	}

	public void UpdateEnergydrink(Energydrink energydrink) 
	{
		energydrinkRepository.save(energydrink);
	}

	public void DeleteEnergydrinkById(long id) 
	{
		energydrinkRepository.deleteById(id);
	}

	public void AddEnergydrink(Energydrink energydrink) 
	{
		energydrinkRepository.save(energydrink);
	}
}
