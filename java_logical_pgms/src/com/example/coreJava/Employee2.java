package com.example.coreJava;

public class Employee2 {
	int id;
	String name;
	public Employee2(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public static void main(String[] args) {
		Employee2 emp = new Employee2(121, "Rajendra");
		System.out.println("Employee Id:"+emp.id+"\nEmployee Name:"+emp.name);
	}
}
