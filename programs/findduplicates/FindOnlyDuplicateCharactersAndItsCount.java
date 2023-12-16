package com.java.eight.programs.findduplicates;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindOnlyDuplicateCharactersAndItsCount {
	public static void main(String[] args) {
		String str = "helloworld";
		
		Map<Character, Long> map = str
				.chars()
				.mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		map.forEach((key, value) -> {
			if (value > 1) {
				System.out.println(key + " : " + value);
			}
		});
	}
}
