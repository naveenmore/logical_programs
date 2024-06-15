package com.superKeyword.java;

public class Demo {
	static int  k =8;
	static int arrayIndex(int x, int y) {
		if(x == k) {
			return y;
		}
		else {
			return -1;
		}
	}

	public static void main(String[] args) {
		int arr[]= {2, 7, 9, 12, 8, 21};
		int result=0;
		for (int i = 0; i < arr.length; i++) {
			result = arrayIndex(arr[i], i);
			if (result != -1) {
				System.out.println("Index of "+ k +" is "+result);
				break;
			}
		}
		if (result== -1) {
			System.out.println("-1");
		}
	}
}