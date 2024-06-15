package com.example.coreJava;

public class Student2 {
	String name;
	int age;
	public static void main(String[] args) {
		Student2 st1 = new Student2();
		Student2 st2 = new Student2();
		
		st1.name = "Naveen";
		st1.age = 23;
		st2.name = "Sachin";
		st2.age = 21;
		
		System.out.println("Name\tAge");
		System.out.println("--------------");
		System.out.println(st1.name+"\t"+st1.age);
		System.out.println(st2.name+"\t"+st2.age);

		

	}
}
