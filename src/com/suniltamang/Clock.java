package com.suniltamang;
import java.util.Scanner;
import java.time.LocalTime;
public class Clock {
	 public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Hour clock");
		int hr = sc.nextInt();
		System.out.println("Enter the MIN clock");
		int min = sc.nextInt();
		alarm(hr, min);
	}
	 
	 public static void alarm(int hr, int min) {
		 boolean on =checkAlarm(hr, min);
//		 if (on) {
//			 beep();
//			 on=checkAlarm(hr, min);
//		 }
//		 
//		 if (on) {
//			 beep();
//			 on=checkAlarm(hr, min);
//		 }
//		 
//		 if (on) {
//			 beep();
//			 on=checkAlarm(hr, min);
//		 }
		 
		 while(on) {
			 beep();
			 on=checkAlarm(hr,min);
		 }
	 }
	 
	 public static boolean checkAlarm(int hr, int min) {
		 LocalTime now =LocalTime.now();
		 if (hr==now.getHour() && min==now.getMinute()) {
			 return true;
		 }
		 return false;
	 }
	 
	 public static void beep() {
		 LocalTime now =LocalTime.now();
		 System.out.println("BEEP BEEP BEEP");
		 //System.out.println("Hour:"+now.getHour());
		 //System.out.println("Min:"+now.getMinute());
	 }
}
