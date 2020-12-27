package com.suniltamang;

public class RubicCubeChampion {
	public static void main(String[] args) {
		double speed[]= {8,4,6.6,12,12,11,10.4};
		double result=findChampions(speed);
		System.out.println("Champion record is :"+result);
		System.out.println("Congratulation winner");
	}
	
	public static double findChampions(double speed[]) {
		int size=speed.length;
		double min=speed[0];
		for(int i=1; i<size; i++) {
			if(speed[i]<min){
				min=speed[i];
				break;
				
			}
			
		}
		return min;
	}

}
