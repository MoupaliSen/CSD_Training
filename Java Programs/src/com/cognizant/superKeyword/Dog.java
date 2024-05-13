package com.cognizant.superKeyword;

public class Dog extends Animal {
	String color="Black";
	
	void printColour() {
		System.out.println(color);
		System.out.println(super.color);
	}

}
