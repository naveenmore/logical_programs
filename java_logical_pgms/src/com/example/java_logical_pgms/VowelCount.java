package com.example.java_logical_pgms;

import java.util.Iterator;
import java.util.Scanner;

public class VowelCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String ");
		String word = sc.next();
		int vowCount =0;

		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i)== 'a' || word.charAt(i)== 'e' || word.charAt(i)== 'i' || word.charAt(i)== 'o' || word.charAt(i)== 'u' ) {
				vowCount++;
			} else {
				continue;
			}
		}
		System.out.println("Vowels present in a given word = "+vowCount);
	}

}
