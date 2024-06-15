package com.constructorOvrldng.java;

public class Demo {
	Demo(int age){
		this(5.5);
		System.out.println("Age:"+age);
	}

	Demo(double height){
		System.out.println("Height:"+height);
	}

	Demo(String name){
		this(25);
		System.out.println("Name:"+name);
	}
	public static void main(String[] args) {
		Demo d1 = new Demo("Naveen");

	}
}
