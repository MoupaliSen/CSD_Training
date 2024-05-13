package com.oops.inheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son s = new Son();
		System.out.println("Father assest is:"+s.assest);
		
		s.education();
		
		System.out.println("Age of son:"+s.age);
		
		Father f = new Father();
		f.education();
		
		GrandSon gs = new GrandSon();
		
		System.out.println("GrandFather assest:"+gs.assest);
		
		System.out.println("Father age:"+gs.age);
		
		gs.education();
		System.out.println("GrandChild standard:"+gs.standard);


		
		

	}

}
