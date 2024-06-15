package com.example.coreJava;

public class Student {

	String name = "Raju";
	int age = 23;
	double marks = 76.5;

	public static void main(String[]args) {
		Student std = new Student();
		System.out.println("Student Name\tStudent Age\tStudent Marks");
		System.out.println("----------------------------------------------");
		System.out.println(std.name+"\t\t"+std.age+"\t\t"+std.marks);
	}

}
