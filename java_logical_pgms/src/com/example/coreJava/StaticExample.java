package com.example.coreJava;

public class StaticExample {
	static int age = 25;
	static void dispaly() {
		System.out.println("Iam "+age+" year old");
	}
	public static void main(String[] args) {
		System.out.println("Accessing static properties and behaviour in the same class");
		StaticExample.dispaly();
		System.out.println(StaticExample.age);
		System.out.println(Employee.age);
	}
}
//we can access properties with the class name in the same class 