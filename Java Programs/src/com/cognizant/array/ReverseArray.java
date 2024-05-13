package com.cognizant.array;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {12,16,20,24,28};
		int n = a.length;
		
	for(int i=n-1;i>=0;i--)
		{
			System.out.println(a[i]+" ");
		}
		
//		//using start end 
//		int start =0;
//		int end = n-1;
//		
//		while(start<end)
//		{
//			int temp = a[start];
//			a[start] = a[end];
//			a[end] = temp;
//			start++;
//			end--;
//			
//			
//		}
//		for(int i=0;i<n;i++)
//		{
//			System.out.println(a[i]+" ");
//		}
//		
//		
//		
//
}

}
