package com.example.coreJava;

//import java.util.Scanner;

public class SwitchStatement {
	public static void main(String[]args) {
//		Scanner sc = new Scanner(System.in);//dynamic or user input
//		System.out.println("Enter Grade ");
//		char grade = sc.();
		char grade = 'd';//static input
		switch (grade) {
		case 'A' : System.err.println("Excellent");
		break;
		case 'B' : System.out.println("Average");
		break;
		case 'C' : System.out.println("Bad");
		break;
		default : System.out.println("Invalid Entry");
		}
	}
}
