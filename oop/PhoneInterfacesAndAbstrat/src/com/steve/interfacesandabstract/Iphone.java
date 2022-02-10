package com.steve.interfacesandabstract;

public class Iphone extends Phone implements Ringable {
	
	public Iphone(String versionNumber, int batteryPercentage, String carrier, String ringtone) {
		super(versionNumber, batteryPercentage, carrier, ringtone);
	}
	
	
	
	public void displayInfo() {
		System.out.println("Siri is displaying info");
		System.out.println(String.format("Iphone info: \n Version Number: %s \n BatteryPercentage: %s \n Carrier: %s \n Ring Tone: %s", this.getVersionNumber(), this.getBatteryPercentage(), this.getCarrier(), this.getRingtone()));
	}
	public void ring() {
		System.out.println("Siri ringing!!!  - " + this.getRingtone());
	}
	public void unlockPhone() {
		System.out.println("Unlocking Phone using Passcode!");
	}
}
