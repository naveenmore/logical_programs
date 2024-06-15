package com.example.java_logical_pgms;

public class Factorial {
	public static void main(String[]args) {
		int n =5;
		int power = 1;
		for(int i=1; i<=n; i++) {
			power = (power*i);
		}
		System.out.println("The Factorial of "+n+" is : "+power);
	}
}
