package com.example.coreJava;

public class staticBlockExample2 {
	static int age;
	static {
		System.out.println("Initializing age to 20");
		age=20;
	}

	public static void main(String[] args) {
		System.
		out.println(staticBlockExample2.age);
	}

	static {
		System.out.println("Re-intializing age to 30");
		age=30;
	}
}
