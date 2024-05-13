package com.cognizant.array;

import java.util.Scanner;

public class ArmStrongAnother {
	public static void main(String[] args)
	{
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		num=sc.nextInt();
		
		System.out.println("Is armstrong number: "+isArmstrong(num));
		
				
	}
	static boolean isArmstrong(int n)
	{
		int digits=0,temp;
		temp=n;
		int sum=0;
		
		while(temp>0)
		{
			temp=temp/10;
			digits++;
		}
		System.out.print("Number of digits: " +digits);
		
		//temp=n;
		while(temp>0)
		{
			int lastdigits = temp%10;
			sum = (int) (sum+Math.pow(lastdigits, digits));
			temp=temp/10;
			
		}
		System.out.println("\n Sum is : "+sum);
		if(sum==n)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
