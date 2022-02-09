package com.steve.olympiansinheritance;

public class Olympian {
	private String name;
	private int energyLevel;
	private String country;
	
	public Olympian() {
		this.name = "Guest user";
		this.country = "World";
	}
	
	public Olympian(String name, String country, int energyLevel) {
		this.name = name;
		this.country = country;
		this.energyLevel = energyLevel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	
	
}
