package com.example.coreJava;

public class staticBlockExample {
	static {
		System.out.println("Iam in staic block-1");
	}

	static {
		System.out.println("Iam in static block-2");
	}
	public static void main(String[] args) {
		System.out.println("Iam in main method");
	}

	static {
		System.out.println("Iam in static block-3");
	}
}
/*static blocks are used for initialization
 * static block will execute before the main method or during the class loading time
 * we can have multiple static blocks , but will execute sequentially*/
