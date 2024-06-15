package com.example.java_logical_pgms;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");

		int num = sc.nextInt();
		int org = num;
		int rev = 0,rem=0;
		while (num > 0) {
			rem = num%10;
			rev = (rev*10) + rem;
			num = num /10;
		}
//		System.out.println(rev);
		if (rev == org) {
			System.out.println(org+"-->Palindrom");
		} else {
			System.out.println(org+"-->Not Palindrom");
		}
	}
}