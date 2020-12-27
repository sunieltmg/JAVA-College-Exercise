package com.suniltamang;

import java.util.Scanner;

public class SmartCoffee {
	public static void main(String[] args) {
		String coffeeType;
		Scanner sc=new Scanner(System.in);//we have to call class System.in for taking input from system
//		System.out.println("Please enter the passcode :");
//		int passcode=sc.nextInt();//for taking integer input
//		//double passcode =sc.nextDouble();//for taking double input
//		//string passcode=sc.nextLine(); // for taking string input
//		if(passcode==312) {
//			coffeeType="Milk Coffee";
//			
//		}
//		else if(passcode==555){
//			coffeeType="BlackCoffee";
//			
//		}
//		
//		else if(passcode==629) {
//			coffeeType="Vanilla latte";
//		}
//		
//		else {
//			coffeeType="Unknown";
//		}
//		
//		System.out.println("The drink that you have ordered is :"+coffeeType);
		
		
		//WAP to display the result of a student
		
//		System.out.println("Input Enter mark obtained:");
//		int mark=sc.nextInt();
//		String result;
//		
//		if (mark<40) {
//			result="fail";
//			
//		}
//		
//		else if(mark>50 && mark<70) {
//			result="first division";
//		}
//		
//		else if(mark>70) {
//			result="distinction";
//		}
//		
//		else {
//			result="invalid";
//		}
//		
//		System.out.println("Your obtained result is :"+result);
		
		
		//switch is another decision making statement
		//We can switch on the basis of different cases
//		System.out.println("Please enter drink you wish :");
//		int passcode=sc.nextInt();
//		switch(passcode) {
//		case 312:
//			coffeeType="Milk Coffee";
//			break;
//			
//		case 555:
//			coffeeType="Black Coffee";
//			break;
//			
//			
//		case 629:
//			coffeeType="Vanilla latte";
//			break;
//			
//		default:
//			coffeeType="unknown";
//		}
//		
//		
//		
//		System.out.println("The drink you selected is :"+coffeeType);
	
		System.out.println("My weekly routine \n 1)Monday \n 2)Tuesday \n 3)Wednesday \n 4)Thrusday \n 5)Friday \n 6)Saturday\n 7)Sunday \nEnter your choice(1/2/3/4/5/6/7) :");
		int dayOfWeek=sc.nextInt();
		String schedule;
		switch(dayOfWeek) {
		case 1:
			schedule="Gym in the morning";
			break;
			
		case 2:
			schedule="Class after work";
			break;
			
		case 3:
			schedule="Mettings all day";
			break;
			
		case 4:
			schedule="Work from home";
			break;
			
		case 5:
			schedule="Game night after work";
			break;
			
		case 6:
			schedule="Free";
			break;
			
		case 7:
			schedule="Free";
			break;
			
		default:
			schedule="unknown";
			
		}
		
		System.out.println("Your day routine is:"+schedule);
		
	}
}
