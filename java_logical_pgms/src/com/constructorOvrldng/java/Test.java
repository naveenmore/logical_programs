package com.constructorOvrldng.java;

public class Test {
	public static void main(String[] args) {
		Employee emp = new Employee();
		Employee emp1 = new Employee(1234);
		Employee emp2 = new Employee("Naveen");
		Employee emp3 = new Employee(1234,"Naveen");
	}
}
