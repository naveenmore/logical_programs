package com.example.java_logical_pgms;

import java.util.HashMap;
import java.util.Map;

public class WordCount2 {

	public static void main(String[] args) {
		String str = "Hello world hello Hello world";
		Map<String, Integer> wordCountMap = new HashMap<>();

		String[] words = str.split(" ");

		for (String word : words) {
			if (wordCountMap.containsKey(word)) { //for each loop
				wordCountMap.put(word, wordCountMap.get(word) + 1);
			} else {
				wordCountMap.put(word, 1);
			}
		}
		// Print word count ..for each loop
		for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}
}

