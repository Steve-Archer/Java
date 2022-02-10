package com.steve.interfacesandabstract;

public class Tester {

	public static void main(String[] args) {
		
		Iphone iphone1 = new Iphone("ios12", 100, "AT&T", "Blessings");
		iphone1.ring();
		iphone1.unlockPhone();
		iphone1.displayInfo();
		
		Android android1 = new Android("S12", 110, "Verizon", "We winning");
		android1.ring();
		android1.unlockPhone();
		android1.displayInfo();
		
		
		
	}
}
