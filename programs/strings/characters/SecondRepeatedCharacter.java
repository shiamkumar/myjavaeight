package com.java.eight.programs.strings.characters;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SecondRepeatedCharacter {
	public static void main(String[] args) {

		String str = "abcsdnvsn";

		Map<Character, Long> result = str
				.chars()
				.mapToObj(ch -> (char) ch)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

		Optional<Character> firstRepeat = result
				.entrySet()
				.stream()
				.filter((e) -> e.getValue() > 1)
				.map(e -> e.getKey())
				.skip(1)
				.findFirst();
		System.out.println("Second Repeated Character: " + firstRepeat.orElse(null));

	}
}
