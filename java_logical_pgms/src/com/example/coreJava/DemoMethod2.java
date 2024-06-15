package com.example.coreJava;
//Method with argument without return type
public class DemoMethod2 {
	void addition(int a, int b) {
		int sum = a+b;
		System.out.println("Addition of "+a+ " and "+b+ " is:"+sum);
	}

	void dispaly(String name, int age) {
		System.out.println("My name is "+name+ " and iam "+age + " year old");
	}
	public static void main(String[] args) {
		DemoMethod2 d2 = new DemoMethod2();// creating an object
		d2.addition(29, 34);//calling or invoking 
		d2.dispaly("Naveen", 25);
		d2.addition(65, 23);//a method can invoked multiple times 
	}
}
