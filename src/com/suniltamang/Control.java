package com.suniltamang;

public class Control {
	public static void main(String[] args) {
		//If statement
		boolean isGreen=false;
		
		if(isGreen) {
			System.out.println("You can Drive");
			
			
		}
		
		
		//variable scope
		
		if(isGreen) {
			double bikeSpeed=50.5; //in km
			System.out.println("you can drive");
		System.out.println("your bike speed is:"+bikeSpeed);
		}
		
		
		//if-else
		
		if(isGreen) {
			System.out.println("You can Drive");
			
		}
		
		else {
			System.out.println("You have to Stop");
		}
	}
}
