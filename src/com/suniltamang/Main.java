package com.suniltamang;
import java.awt.Point;
import java.util.Arrays;
import java.util.Date;
public class Main {
	public static void main(String[] args) {
		byte age=21;
		long viewCount=3_123_456_789L;
		float price=10.99F;
		Date now=new Date();
		System.out.println(age);
		System.out.println(now);
		Point point1=new Point(1,1);
		Point point2=point1;
		point1.x=2;
		String message=new String("Hello world");
		System.out.println(point2);
		System.out.println(message);
		System.out.println(message.length());
		System.out.println(message.endsWith("d"));
		System.out.println(message.replace("Hello", "Nepal"));
		System.out.println(message.toUpperCase());
		System.out.println(message.toLowerCase());
//		int[] numbers=new int[5];
//		numbers[0]=1;
//		numbers[1]=11;
//		numbers[2]=111;
//		numbers[3]=1111;
//		numbers[4]=11111;
//		System.out.println(Arrays.toString(numbers));
//		
		
		int[] numbers= {1,11,2,1111,5};
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
		
		final float pi=3.14F;
		System.out.println(3+4);
		
		double prices = (double)3/(double)4;
		System.out.println(prices);
		
		int minResult=Math.min(1, 2);
		System.out.println(minResult);
		
		int maxResult=Math.max(1, 2);
		System.out.println(maxResult);
		
		double guess =Math.random();
		System.out.println(guess);
		
		long rounded=Math.round(guess*100);
		System.out.println(rounded);
		
		
		int result=(int)Math.round(Math.random()*100);
		System.out.println(result);	
		
		
	}
 
} 
