package com.steve.zookeeper;

public class Gorilla extends Mammal {
	public void throwSomething() {
		System.out.println("something has been thrown...");
		energyLevel -= 5;
	}
	public void eatBananas() {
		System.out.println("the gorilla is satisfied with bananas...");
		energyLevel += 10;
	}
	public void climb() {
		System.out.println("the gorilla has climbed a tree...");
		energyLevel -= 10;
	}
	
	
	
}
