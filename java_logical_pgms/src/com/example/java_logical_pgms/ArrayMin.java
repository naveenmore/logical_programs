package com.example.java_logical_pgms;

public class ArrayMin {
	public static void main(String[] args) {
		int [] numberArray= {12, 15, 24,98,5,2,  65, 76};
		int min = numberArray[0];
		for (int i = 0; i < numberArray.length; i++) {
			if(numberArray[i] < min) {
				min = numberArray[i];
			}
		}
		System.out.println("Minimum number in a given array : "+ min);
	}
	

}
