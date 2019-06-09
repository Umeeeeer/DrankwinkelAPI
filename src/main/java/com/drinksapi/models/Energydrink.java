package com.drinksapi.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Energydrink
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
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

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
}

