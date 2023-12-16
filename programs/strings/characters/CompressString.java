package com.java.eight.programs.strings.characters;

import java.util.HashMap;
import java.util.Map;

public class CompressString {
	public static void main(String[] args) {
		String str = "AABBBBCDDD";

		StringBuilder result = new StringBuilder();
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (map.containsKey(ch)) {
				int count = map.get(ch);
				count++;
				map.replace(ch, count);
			} else {
				map.put(ch, 1);
			}
		}

		for (Character key : map.keySet()) {
			result.append(key).append(map.get(key));
		}
		System.out.println(result.toString());

	}
}
