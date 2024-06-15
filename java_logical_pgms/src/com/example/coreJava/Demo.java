package com.example.coreJava;

public class Demo {
	int age =23;
	Demo(int age){
		this.age = age;
	}
	public static void main(String[] args) {
		Demo d1 = new Demo(25);
		System.out.println(d1.age);
	}
}
