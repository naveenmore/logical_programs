package com.example.coreJava;
//method with return type with argument
public class DemoMethod4 {
	int squre(int n) {
		return n*n;
	}
	public static void main(String[] args) {
		DemoMethod4 d4 = new DemoMethod4();
		int result = d4.squre(8);
		System.out.println(result);
	}

}
