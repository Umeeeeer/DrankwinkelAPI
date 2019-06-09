package com.drinksapi.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Order_table")
public class Order 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
    private Long price;
    
    @OneToMany(cascade = {CascadeType.ALL})
    private List<Beer> beers;
    
    @OneToMany(cascade = {CascadeType.ALL})
    private List<Liquor> liquors;
    
    @OneToMany(cascade = {CascadeType.ALL})
    private List<Energydrink> energydrinks;

	public List<Beer> getBeers() {
		return beers;
	}
	public void setBeers(List<Beer> beers) {
		this.beers = beers;
	}
	public List<Liquor> getLiquors() {
		return liquors;
	}
	public void setLiquors(List<Liquor> liquors) {
		this.liquors = liquors;
	}
	public List<Energydrink> getEnergydrinks() {
		return energydrinks;
	}
	public void setEnergydrinks(List<Energydrink> energydrinks) {
		this.energydrinks = energydrinks;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getPrice() {
		return price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}
}
