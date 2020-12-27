package com.suniltamang;

public class LuckyNo {
	public static void main(String[] args) {
		//random gives random no from 0 to almost(1)
		double randomNo=Math.random();
		System.out.println("Initial Random Number :"+randomNo);
		
		//Changing range from 0- almost(10)
		randomNo=randomNo*10;
		System.out.println("The random Number after conversion is :"+randomNo);
		
		//casting double into integer
		int randomInt=(int)randomNo;
		System.out.println("The random Number after casting is :"+randomInt);
		
		//shifting to range of 10
		randomInt=randomInt+1;
		System.out.println("Final random no is :" +randomInt);
	}

}
