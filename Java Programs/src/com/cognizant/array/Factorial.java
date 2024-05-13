package com.cognizant.array;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");

		int num=sc.nextInt();
		long factorial =1;
		
		for(int i=1;i<=num;i++)
		{
			factorial =factorial*i;
		}
		System.out.println("Fcatorial of Number: "+factorial);

	}

}
