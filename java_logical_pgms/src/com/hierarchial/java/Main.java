package com.hierarchial.java;

public class Main {
	public static void main(String[]args) {
		Car car = new Car();
		System.out.println("Brand:"+car.brand+"\nFuel:"+car.fuel);
		car.start();
		System.out.println("---------------------");
		Bike bike = new Bike();
		System.out.println("Brand:"+bike.brand+"\nCost:"+bike.cost);
		bike.stop();
	}
}
