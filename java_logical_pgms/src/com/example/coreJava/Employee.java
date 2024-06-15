package com.example.coreJava;

public class Employee {
	static int age=12;//this static property is utilized in staticExample.java class  
	String name = "Naveen";
	int id = 2523;
	double salary = 22000;
	public static void main(String[] args) {
		Employee emp = new Employee();
		System.out.println("Employee Name:"+emp.name+"\tEmployee Id:"+emp.id+"\tEmployee Salary"+emp.salary);

	}
}


