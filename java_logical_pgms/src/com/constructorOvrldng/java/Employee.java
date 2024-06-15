package com.constructorOvrldng.java;

public class Employee {
	Employee(){
		System.out.println("Constructor without argument");
	}

	Employee(int id){
		System.out.println("Employee ID:"+id);
	}

	Employee(String name){
		System.out.println("Employee Name:"+name);
	}

	Employee(int id, String name){
		System.out.println("Employee ID:"+id+"\tEmployee Name:"+name);
	}
}
