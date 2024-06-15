package com.example.coreJava;

public class CunstrucrorDemo2 {
	double height = 5.5;
	public CunstrucrorDemo2(double height) {
		System.out.println(height);
		System.out.println(this.height);
	}
	int age=38;
	public CunstrucrorDemo2() {
	System.out.println(age);
	}
	public static void main(String[] args) {
		CunstrucrorDemo2 demo2= new CunstrucrorDemo2(25);
		CunstrucrorDemo2 demo= new CunstrucrorDemo2();	

	}
	
}
