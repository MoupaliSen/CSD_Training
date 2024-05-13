package com.cognizant.multipleInheritance;

public class ClassC implements ClassA,ClassB{
	
	public void run()
	{
		System.out.println("A is running");
	}
	
	public void eat()
	{
		System.out.println("B is eating");
	}
	
	public static void main(String args[])
	{
		ClassC c = new ClassC();
		c.run();
		c.eat();
	}

}
