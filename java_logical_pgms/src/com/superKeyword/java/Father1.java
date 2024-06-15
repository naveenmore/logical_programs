package com.superKeyword.java;

public class Father1 {
	Father1(int age){
		System.out.println(age);
	}

}

class Son1 extends Father1{
	public Son1() {
		super(10);
		System.out.println("Hello");
	}
}
