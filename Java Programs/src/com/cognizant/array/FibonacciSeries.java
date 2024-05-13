package com.cognizant.array;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n =10;
		
		int firstnum=0;
		int secondnum=1;
		int nextnum;
		System.out.println("Fibonacci Series");

		for(int i=1;i<=n;i++)
		{
			System.out.print(firstnum+", ");
			nextnum = firstnum+secondnum;
			firstnum=secondnum;
			secondnum=nextnum;
		}

	}

}
