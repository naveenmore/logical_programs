package com.superKeyword.java;

public class Father {
	Father(){
		System.out.println("1");
	}
}

class Son extends Father{
	public Son() {
		//implicitly super class constructor calling
		System.out.println("2");
	}
}

//if the  super class has non parameterized constructor then constructor chaining 
//will happen implicitly

