package com.example.java_logical_pgms;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int number = sc.nextInt();
		
		if (number%2==0) {
			System.out.println(number+" = Even Number");
		} else {
			System.out.println(number+" = Odd Number");

		}
	}
	
}
