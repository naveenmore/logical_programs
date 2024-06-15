package com.example.coreJava;

public class NonStaticBlockExmpl1 {
	{
		System.out.println("Iam in Non Static Block -1 ");
	}
	
	{
		System.out.println("Iam in Non Static Block -2 ");
	}
	
	public static void main(String[] args) {
		NonStaticBlockExmpl1 d1 = new NonStaticBlockExmpl1();
		System.out.println("Iam in main method");
	}
}

/* Non Static block will execute during object creation */
