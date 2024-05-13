package com.cognizant.array;

public class ArraySort {
	public static void main(String[] args) {
	int a[] = {10,64,55,23,107,33,45};
	int temp=0;
	
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]>a[j])
			{
				temp=a[i];
				a[i] = a[j];
				a[j]=temp;
			}
		}
	}
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]+"");
	}
	}
}
