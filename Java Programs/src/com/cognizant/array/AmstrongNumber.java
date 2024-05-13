package com.cognizant.array;

public class AmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=371;
		int temp,rem;
		int sum=0;
		
		temp=num;
		while(temp!=0)
		{
			rem=temp%10;
			sum = (int) (sum+Math.pow(rem, 3));
			temp=temp/10;
		}
		if(sum==num)
		{
			System.out.println(num+" is a Amstrong Number");
		}
		else
		{
			System.out.println(num+" is not a Amstrong Number");

		}
		
//
		
		
}

}
