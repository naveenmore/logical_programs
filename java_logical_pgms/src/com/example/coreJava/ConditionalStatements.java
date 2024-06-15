package com.example.coreJava;

public class ConditionalStatements {
	public static void main(String[] args) {

		//simple if 
//		int a = 10;
//		if(a<=10) {
//			System.out.println(a+ " is less  than or equal to 10");
//		}
//		System.out.println("End of the program");
//
//		System.out.println("======================");
//		int number = 5;
//		if(number > 0) {
//			System.out.println("Given number is a positive number");
//		}
//
//		System.out.println("======================");
//		//ifelse statement
//		int age = 21;
//		if (age >= 18) {
//			System.out.println("Eligible for Voting  :-)");
//		} else {
//			System.out.println("Not eligible");
//		}
//
//		int num= 22;
//		if (num %2==0) {
//			System.out.println(num+" Even Number ");
//		} else {
//			System.out.println(num+" Odd Number");
//		}
System.out.println("====================");
		//nested if
		int n = 12;
		if (n > 20) {
			if (n>=10) {
				System.out.println(n+" is greater than 10");
			}
		}
			else {
				System.err.println(n+" is not equal to 10");
			}
			
		}
	
}
