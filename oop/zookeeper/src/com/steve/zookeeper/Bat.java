package com.steve.zookeeper;

public class Bat extends Mammal {
	public Bat() {
		this.energyLevel = 300;
	}
	public void fly() {
		System.out.println("the sound of a bat taking off...");
		energyLevel -= 50;
	}
	public void eatHumans() {
		System.out.println("so- well, nevermind...");
		energyLevel += 25;
	}
	public void attackTown() {
		System.out.println("the sound of a town on fire...");
		energyLevel -= 100;
	}
	
	
	
}
