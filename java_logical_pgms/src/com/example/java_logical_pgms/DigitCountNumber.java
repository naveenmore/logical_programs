package com.example.java_logical_pgms;

import java.util.Scanner;

public class DigitCountNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = sc.nextInt();
		int count =0;

		while (number > 0) {
			if (number == 0) {
				System.out.println("Number of digits in a given number is = 1");
				System.exit(0);
			} else {
				number = number /10;
				count++;
			} 
		}
		System.out.println("Number of digits in a given number is ="+count);
	}
}
