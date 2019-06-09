package com.drinksapi.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Liquor
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String alcoholpercentage;
	private String type;
	private String name;
	private Boolean canbesoldtominors;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Boolean getCanbesoldtominors() {
		return canbesoldtominors;
	}
	public void setCanbesoldtominors(Boolean canbesoldtominors) {
		this.canbesoldtominors = canbesoldtominors;
	}
	
	public String getAlcoholpercentage() {
		return alcoholpercentage;
	}
	public void setAlcoholpercentage(String alcoholpercentage) {
		this.alcoholpercentage = alcoholpercentage;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
}
