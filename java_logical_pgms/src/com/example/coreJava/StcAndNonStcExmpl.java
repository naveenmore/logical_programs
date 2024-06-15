package com.example.coreJava;

public class StcAndNonStcExmpl {
	static int age;
	static {
		System.out.println("Initializing Age to:20");
		age=20;
	}
	
	String name;
	{
		System.out.println("Initializing Name to Naveen");
		name = "naveen";
	}
	
	public static void main(String[]args) {
		System.out.println("Im in main method");
		StcAndNonStcExmpl s1 = new StcAndNonStcExmpl();
		System.out.println(s1.name);
		System.out.println("-------------------------");
		m1(10);
	}

	static void m1(int a) {
		 System.out.println("Hii");
		 System.out.println(m2(10));
	}

	 static int m2(int n) {
		return n*3;
	}
	
	
}
/*static properties will execute before the main method and 
non static properties will execute during the class loading time or during the object 
creation time(Instantiation)*/ 