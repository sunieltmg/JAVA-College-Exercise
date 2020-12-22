package com.suniltamang;
import java.awt.Point;
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
		
	}
 
} 
