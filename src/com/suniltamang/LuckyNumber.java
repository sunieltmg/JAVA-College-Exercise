package com.suniltamang;

public class LuckyNumber {
	public static void main(String[] args) {
		// random number from 0 to almost 1
		double randomNumber =Math.random();
		System.out.println("Initial Random Number :"+randomNumber);
		
		
		//changing range to 0-almost 10
		randomNumber = randomNumber * 10;
		System.out.print("Random Number after conversion:"+ randomNumber);
		
		//casting to integer
		int randomInt=(int)randomNumber;
		System.out.println("Random Number after casting:"+randomInt);
		
		//shifting to range of 10
		randomInt=randomInt + 1;
		System.out.println("Final Random Number:"+randomInt);
		
	}
	
	
}


////
//public class LuckyNumber {
//
//	 
//
//public static void main(String[] args) {
//
// 
//
// // random number form 0 to almost(1)
//
//double randomNumber = Math.random();
//
// System.out.println("Initail Random Number :" + randomNumber);
//
// 
//
// // changing range to 0 - almost(10)
//
// randomNumber = randomNumber * 6;
//
// System.out.println("Random Number after conversion :"+ randomNumber);
//
// 
//
// //casting to integer
//
// int randomInt = (int)randomNumber;
//
// System.out.println("Random Number after Casting :" + randomInt);
//
// 
//
// // shifting to range of 10
//
// randomInt = randomInt + 1;
//
//System.out.println("Final Random Number :" + randomInt);
//
//}
//
//
// 
//
//}