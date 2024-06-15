package com.example.java_logical_pgms;

public class CamelCase {
	public static void main(String[] args) {
		String name = "naveen ravi more";
		String[] words = name.split(" ");
		String camelName = "";
		
		for (int i = 0; i < words.length; i++) {
			camelName = camelName +(char)(words[i].charAt(0)-32) + words[i].substring(1)+ " ";
		}
		System.out.println(camelName);
	}

}
