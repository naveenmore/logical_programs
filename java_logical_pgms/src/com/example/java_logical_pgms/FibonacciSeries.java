package com.example.java_logical_pgms;

public class FibonacciSeries {
	public static void main(String[] args) {
		int number = 10;
		int a=0,b=1,c=0;
		//				for (int i = 0; i <= number; i++) {
		//					System.out.print(a+" ");
		//					c=a+b;
		//					a=b;
		//					b=c;
		//				
		//				}
		System.out.println("=============================");
		//if i want to print fibonacci numbers which lies between 1-n
		for (int i = 0; i < number ; i++) {
			System.out.print(a+" ");
			//			if (c>=100) {
			//				break;
			//			}
			c=a+b;
			a=b;
			b=c;
		}
	}
}
