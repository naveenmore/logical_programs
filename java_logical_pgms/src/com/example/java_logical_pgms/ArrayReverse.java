package com.example.java_logical_pgms;

public class ArrayReverse {
	public static void main(String[] args) {
		int arr[] = { 1,2,3,4,5,6,7,8};
		int n = arr.length;
		int reversedArray[] = new int[n];

		for (int i = 0; i < arr.length; i++) {
			reversedArray[i] = arr[(n -i -1)];
			//8-0-1 =7 = arr[7] 
			//8-1-1 =6= arr[6]
		}

		for (int i = 0; i < reversedArray.length; i++) {
			System.out.print(reversedArray[i]+" ");
		}
	}
}
