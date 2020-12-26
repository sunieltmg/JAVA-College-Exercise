package com.suniltamang;

public class Restaurant {
	public static void main(String[] args) {
//		int rating=2;
//		if (rating>=1 && rating<=5) {
//			System.out.println("Thank You");
//			if (rating<=2) {
//				System.out.println("Please give us reason to improve");
//			}
//		}
		
		boolean isSnowing=true;
		boolean isRaining=true;
		double temperature=30;
		if(isSnowing && isRaining && temperature< 50){// && denotes AND operator
			System.out.println("Let's stay inside");// || denotes OR operator
		}
		else {
			System.out.println("Let's go out");
		}
	}
	
}
