package com.example.coreJava;

public class LoopingStatement {
	public static void main(String[] args) {
		//print Hello world 5 times
		for(int i=1; i<=5; i++) {
			System.out.println("Hello World!");
		}
		
		System.out.println("========================");
		//print even number between 1-10
		for (int i = 1; i <= 10; i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		
		
		System.out.println("====================");
		//while loop 
		int n=5;
		int rem=0;
		while(n>0) {
			rem = n%2;
			n--;
			System.out.print(rem+" ");
		}
		System.out.println("");
		
		System.out.println("===================");
		//do while loop
		int x=1;
		do {
			System.out.println(x);
			x++;
		}
		while(x<=5);
			
		}
}

