package com.java.eight.programs.strings.words;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LongestWord {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Bond", "Einstein", "Alice", "Whitman", "Fernando");
		
		Map<Integer, List<String>> result = list.stream().collect(Collectors.groupingBy(String::length, Collectors.toList()));
		System.out.println("result: "+ result);
		result.forEach((key, value) -> {
			if (key == 8) {
				System.out.println(key + " : " +  value);
			}
		});
		
		
		String longestString = list.stream().reduce((word1, word2) -> word1.length()>word2.length()?word1:word2).get();
		System.out.println("Longest String: "+longestString);
	}
}
