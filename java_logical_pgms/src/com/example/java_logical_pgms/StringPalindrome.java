package com.example.java_logical_pgms;

import java.util.Scanner;

public class StringPalindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String word = sc.next();
		String rev ="";
		
		for (int i = word.length()-1; i>=0;  i--) {
			rev = rev + word.charAt(i);
		}
		
		if (rev.equals(word)) {
			System.out.println(word +" Given String is Palindrome");
		} else {
			System.out.println(word +" Not Palindrome");
		}
	}
}
