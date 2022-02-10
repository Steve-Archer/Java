package com.steve.interfacesandabstract;

public class Android extends Phone implements Ringable {
	
	public Android(String versionNumber, int batteryPercentage, String carrier, String ringtone) {
		super(versionNumber, batteryPercentage, carrier, ringtone);
	}
	
	
	
	public void displayInfo() {
		System.out.println("Google Assistant is displaying info");
		System.out.println(String.format("Android info: \n Version Number: %s \n BatteryPercentage: %s \n Carrier: %s \n Ring Tone: %s", this.getVersionNumber(), this.getBatteryPercentage(), this.getCarrier(), this.getRingtone()));
	}
	
	public void ring() {
		System.out.println("Androiddddd ringing!!!  - " + this.getRingtone());
	}
	public void unlockPhone() {
		System.out.println("Unlocking Phone using Passcode!");
	}
}
