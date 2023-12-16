package com.java.eight.programs.strings.characters;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterDuplicateAndItsCount {
	public static void main(String[] args) {
		String str = "hello world";
		Map<Character, Long> result01 = str.chars()
				.mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		result01.forEach((key, value) -> {
			if (value > 1) {
				System.out.println("Duplicate Character: " + key + " and its count is: " + value);
			}
		});
		
		
		Map<Character, Long> result02 = str.chars()
				.mapToObj(ch -> (char) ch)
				.collect(Collectors.groupingBy(ch -> ch, Collectors.counting()));
		result02.forEach((key, value) -> {
			if (value > 1) {
				System.out.println("Duplicate Character: " + key + " and its count is: " + value);
			}
		});
		
		
		Map<Character, Integer> result03 = new HashMap<>();
		for (char ch : str.toCharArray()) {
			result03.put(ch, result03.getOrDefault(ch, 0) + 1);
		}		
		result03.forEach((key, value) -> {
			if (value > 1) {
				System.out.println("Duplicate Character: " + key + " and its count is: " + value);
			}
		});

	}
}
