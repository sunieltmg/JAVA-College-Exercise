package com.suniltamang;

public class SmartCoffee {
	public static void main(String[] args) {
		int passcode=312;
		String coffeeType = null;
		if(passcode==312) {
			coffeeType="Milk Coffee";
			
		}
		else if(passcode==555){
			coffeeType="BlackCoffee";
			
		}
		
		else if(passcode==629) {
			coffeeType="Capachino";
		}
		
		else {
			coffeeType="Unknown";
		}
		
		System.out.println("The drink that you have ordered is :"+coffeeType);
	}
}
