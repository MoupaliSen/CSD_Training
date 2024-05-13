package com.oops.Interface;

public class Speed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle  v1 = new Car();
		v1.run();
		System.out.println(v1.amt());
		
//		Vehicle v2 = new Truck();
//		v2.run();
//		System.out.println(v2.amt());

		System.out.println("Result:"+Vehicle.square(5));


	}

}
