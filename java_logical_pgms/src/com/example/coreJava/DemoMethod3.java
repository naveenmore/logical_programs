package com.example.coreJava;

public class DemoMethod3 {
//method without argument with return type
	String student() {
		return "Raj";
	}
	
	int add() {
		int a=3,b=5;
		return a+b;
	}
	public static void main(String[] args) {
		DemoMethod3 d3 = new DemoMethod3();
		String name=d3.student();//store and print the name
		System.out.println("My name is "+name);
		System.out.println(d3.student());//print without storing
		int sum=d3.add();
		System.out.println(sum);
	}
}
	