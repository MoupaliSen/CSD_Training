package com.cognizant.array;

public class SumOfDigitNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =1234;
		int sum=0;
		
		while(num!=0)
		{
			int num2=num%10;
			sum=sum+num2;
			num=num/10;
		}
		System.out.println("Sum of digits"+ sum);

	}

}
