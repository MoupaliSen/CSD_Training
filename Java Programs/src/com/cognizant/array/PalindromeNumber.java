package com.cognizant.array;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num=121;
        int rev=0;
        int rem,temp;
        
        temp=num;
        while(temp!=0)
        {
        	rem=temp%10;
        	rev= rev*10+rem;
        	temp=temp/10;
        }
        
        if(num==rev)
        {
        	System.out.println(num+ " is a palindrome");
        }
        
        else
        {
        	System.out.println(num+" is not a palindrome");
        }
        
	}

}
