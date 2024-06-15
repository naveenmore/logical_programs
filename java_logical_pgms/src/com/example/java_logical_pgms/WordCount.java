package com.example.java_logical_pgms;

public class WordCount {
	public static void main(String[] args) {
		String name= "naveen";
//convert this string into char array
		char[] a= name.toCharArray();

		for (int i = 0; i < a.length; i++) {
			int count =1;
			for (int j = i+1; j < a.length; j++) {
				if(a[i]==a[j]) {
					count++;
					a[j]='*';
				}
			}
			if (a[i]!='*') {
				System.out.println(a[i]+"-->"+count);
			}
		}
	}
}
