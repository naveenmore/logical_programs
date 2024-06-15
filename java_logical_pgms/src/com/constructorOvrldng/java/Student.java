package com.constructorOvrldng.java;

public class Student {
	Student(int age){
		System.out.println("Age:"+age);
	}

	Student(int age, String name){
		this(age);
		System.out.println("Name:"+name);
	}

	public static void main(String[] args) {
		Student st1 = new Student(25, "Naveen");
	}
}