package com.suniltamang;

public class Weather {
	public static void main(String[] args) {
		boolean isSnowing=true;
		boolean isRaining=false;
		double temperature=28;
		
		if(isRaining || isSnowing || temperature<50){
            System.out.println("Let's stay home");
        }
        else{
            System.out.println("Lets go out.");
        }
	}

}
