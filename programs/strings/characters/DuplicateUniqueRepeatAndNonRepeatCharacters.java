package com.java.eight.programs.strings.characters;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateUniqueRepeatAndNonRepeatCharacters {
	public static void main(String[] args) {
		String str = "helloworld";
		
		Map<String, Long> countOccurrenceOfEachCharacter = Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("Count Occurrence Of Each Character: " + countOccurrenceOfEachCharacter);

		List<String> duplicateCharacters = Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet().stream()
				.filter(e -> e.getValue() > 1)
				.map(Map.Entry::getKey)
				.collect(Collectors.toList());
		System.out.println("Duplicate Characters: " + duplicateCharacters);

		List<String> uniqueCharacters = Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet().stream()
				.filter(e -> e.getValue() == 1)
				.map(Map.Entry::getKey)
				.collect(Collectors.toList());
		System.out.println("Unique Characters: " + uniqueCharacters);
		
		
		String secondNonRepeatingCharacters = Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream()
				.filter(e -> e.getValue() == 1)
				.skip(1)
				.findFirst().get().getKey();
		System.out.println("Second Non Repeating Characters: " + secondNonRepeatingCharacters);
		
		
		String secondRepeatingCharacters = Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream()
				.filter(e -> e.getValue() > 1)
				.skip(1)
				.findFirst().get().getKey();
		System.out.println("Second Repeating Characters: " + secondRepeatingCharacters);
				
				
	}
}
