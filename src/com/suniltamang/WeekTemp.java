package com.suniltamang;

public class WeekTemp {
	public static void main(String[] args) {
		double temp[]= {45.5,50.5,60.5,65.5,70.5,75.5,80.5};
		int avg=(int)calAvg(temp);//passing temp array as argument
		System.out.println("The average  week temperature is :"+avg);
	}
	
	public static double calAvg(double temp[]) {//receiving temp array as parameter
		int size=temp.length;
		double total=0;
		System.out.println(size);
		for (int i=0; i<size; i++) {
			total+=temp[i];
			System.out.println("Data at index "+i+" is "+temp[i]);
		}
		
		return total/size;
		
	}
}
