package com.cognizant.array;

public class LargestAndSmallestElement {
	public static void main(String[] args) {
	
	int arr[] = {12,14,13,16,18};
	 int largest =arr[0];
	 int smallest = arr[0];
	 
	 for(int i=0;i<arr.length;i++)
	 {
		 if(smallest>arr[i])
		 {
			 smallest = arr[i];
		 }
		 if(largest<arr[i])
		 {
			 largest = arr[i];
		 }
		 
	 }
	 System.out.println(largest);
	 System.out.println(smallest);

	}	

}
