package com.example.java_logical_pgms;

public class ArrayIndex {
	static int k = 12;
	static int arrIndex(int x, int y) {
		if(x == k) {
			return y;
		}
		else {
			return -1;
		}
	}
	public static void main(String[] args) {
		int result = 0;
		int arr[] =  {2, 8, 12, 3, 19, 7};
		for (int i = 0; i < arr.length; i++) {
			result = arrIndex(arr[i], i);
			if (result != -1) {
				System.out.println("Index of "+k+" is "+result);
				break;
			}
		}
		if (result == -1) {
			System.out.println("-1");
		}
	}
}
