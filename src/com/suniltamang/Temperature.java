package com.suniltamang;

public class Temperature {
	public static void main(String[] args) {
		//double temp=45.5;//temperature in fahrenheit
		//double temp2=50.5;
		//double temp3=60.5;
				
		//instead of using different variable name for same type of data we can use array
		double temp[]= {45.5,50.5,60.5};
		System.out.println(temp);//it prints the local address of an array not data present inside it
		System.out.println(temp[0]);//access data by index
		
		//in array we cannot add data at new index but can update data at previous index
		//array has fixed memory
		
		//for(initialise; condition; increment) syntax
		int size=temp.length;
		System.out.println(size);
		//use of for loop for single dimensional array
		for(int i=0; i<size; i++) {
			System.out.println(temp[i]);//To print all the values inside an array we use a loop
		}
		
		
		//for each for single dimensional array
		for(double i:temp) {//replacing value of temp to variable i
			System.out.println(i);
		}
		
		
		
		
		
	}
}
	
	


