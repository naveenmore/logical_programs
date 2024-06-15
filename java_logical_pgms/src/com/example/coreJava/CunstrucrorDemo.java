package com.example.coreJava;

public class CunstrucrorDemo {
	public CunstrucrorDemo() {
		System.out.println("Iam in User defined and non parameterized constructor");
		System.out.println("------------------------------");
	}
	
	public CunstrucrorDemo(String name) {
		System.out.println("Name:-"+name);
	}
	public static void main(String[] args) {
		CunstrucrorDemo d1 = new CunstrucrorDemo();
		CunstrucrorDemo d2 = new CunstrucrorDemo("Naveen");
	}
}
