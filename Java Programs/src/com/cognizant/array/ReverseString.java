package com.cognizant.array;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the String");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char ch;
		
		String revstr=" ";
		
		for(int i=0;i<str.length();i++)
		{
			ch = str.charAt(i);
			revstr = ch+revstr;
			
			
		}
		System.out.println("Reverse String: "+revstr);

	}

}
