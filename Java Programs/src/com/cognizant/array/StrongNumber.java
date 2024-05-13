package com.cognizant.array;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum=0;
		int temp = num;
		
		while(temp>0)
		{
			int fact =1;
			int rem = temp%10;
			
			for(int i=1;i<=rem;i++)
			{
				fact = fact*i;
			}
			sum = sum+fact;
			temp = temp/10;
		}
		if(sum==num)
		{
			System.out.println("is a Strong Number");
		}
		else
		{
			System.out.println("is not a Strong Number");

			
		}

	}

}
