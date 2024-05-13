package com.cognizant.array;

public class GreatestTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=12;
		int num2=3;
		int num3=13;
		
//		if(num1>num2)
//		{
//			System.out.println(num1);
//		}
//		else
//		{
//			System.out.println(num2);
//		}
		
		if(num1>num2 && num1>num3)
		{
			System.out.println(num1);
		}
		else if(num2>num1 && num2>num3)
		{
			System.out.println(num2);
		}
		else
		{
			System.out.println(num3);
		}
		

	}

}
