package com.java.eight.programs.strings.words;

import java.util.ArrayList;
import java.util.List;

public class EachWordCharactersReverse {
	public static void main(String[] args) {
		String str = "I am best java developer";
		List<String> words = List.of(str.split(" "));
		List<String> reverseStrList = listIterations(str, words);
		System.out.println(reverseStrList);
		
		String res = str.replaceAll("best", "tseb");
		System.out.println(res);
	}

	public static List<String> listIterations(String str, List<String> words) {
		List<String> reverseList = new ArrayList<>();
		String reverseStr = "";
		for (String word : words) {
				reverseStr = reverseMethod(word);
				reverseList.add(reverseStr);
		}
		return reverseList;
	}

	public static String reverseMethod(String word) {
		String reverseStr = "";
		int size = word.length();
		for (int i = size - 1; i >= 0; i--) {
			reverseStr = reverseStr + word.charAt(i);
		}
		return reverseStr;
	}

}
