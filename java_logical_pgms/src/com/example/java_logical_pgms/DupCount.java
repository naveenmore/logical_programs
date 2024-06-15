package com.example.java_logical_pgms;

public class DupCount {
	public static void main(String[]args) {
		String name="gadag bangalore haveri";
		char a[]=name.toCharArray();

		System.out.println("Duplicate characters and its coutns");

		for (int i = 0; i < a.length; i++) {
			int flag=0, count=1;
			for (int j = i+1; j < a.length; j++) {
				if (a[i]==a[j]) {
					flag =1;
					a[j]='#';
					count++;
				} 
			}
			if (flag==1 && a[i]!='#' && a[i]!= ' ') {
				System.out.println(a[i]+"-->"+count);
			}
		}
	}
}
