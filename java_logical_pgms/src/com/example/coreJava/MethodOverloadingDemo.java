package com.example.coreJava;
//method overloading
public class MethodOverloadingDemo {
void addition(int a, double b) {
	double sum= a+b;
	System.out.println("sum of 2 values:"+sum);
}
void addition(double a, int b) {
	double sum= a+b;
	System.out.println("sum of 2 values:"+sum);
}
public static void main(String[] args) {
	MethodOverloadingDemo d1= new MethodOverloadingDemo();
	d1.addition(2.5, 5);
	d1.addition(3, 3.5);
}
}
