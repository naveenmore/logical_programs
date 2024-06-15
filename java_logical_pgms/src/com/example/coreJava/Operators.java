package com.example.coreJava;

public class Operators {
	public static void main(String[] args) {
		//Arithmetic Operators
		int a =20;
		int b =10;
		System.out.println("a+b="+(a+b)+"\n"+"a-b="+(a-b)+"\n"+"a*b="+(a*b)+"\n"+"a/b="+(a/b)+"\n"+"a%b="+(a%b)+"\n");

		//Assignment Operators
		System.out.println("=======================");
		int c=b;// value of b is assigning to c variable
		System.out.println("Value of c : "+c);

		a+=10;//a = a+10 re initialization using assignment operator
		System.out.println("a value is reinitialised to: "+a);

		System.out.println("======================");
		//Comparison operator , returns boolean result
		System.out.println("is a is greater than b?"+(a>b));
		System.out.println(a==b);
		
		System.out.println("==================");
		//Logical Operators, Returns boolean Results
		System.out.println((a>b && a!=b));
		System.out.println((a>b || a==b));
		
		System.out.println("================");
		//Unary operator
		int d = a++;//post increment....a=30+1=31
		System.out.println(d);	
		d = a--;//post decrement...a=31-1=30
		System.out.println(d);
		d = ++a;// pre increment...a=1+30=31
		System.out.println(d);
		d = --a; //pre decrement....a=-1+31=30
		System.out.println(d);
		
		int i = 46;
		int j = ++i;
		System.out.println(i+ " "+j);

	}
}
