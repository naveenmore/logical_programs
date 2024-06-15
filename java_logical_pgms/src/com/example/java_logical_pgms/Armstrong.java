package com.example.java_logical_pgms;

import java.util.Scanner;
//example 153

public class Armstrong {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		//153
		int n1 = sc.nextInt();
		int n2=n1,n3=n1;
		int count =0;

		while (n1 >0) {
			count++;
			n1 = n1 /10;
		}
		int rem =0;
		int sum = 0;
		while (n2 >0) {
			rem = n2%10;
			n2 = n2 / 10;

			int power = 1;
			for (int i = 1; i <= count; i++) {
				power = power*rem; 
			}
			sum = sum + power;
		}
		//		System.out.println(sum);
		if (sum == n3) {
			System.out.println(n3+"-->Armstrong Number");
		} else {
			System.out.println(n3+"-->Not Armstrong Number");
		}
	}
}

