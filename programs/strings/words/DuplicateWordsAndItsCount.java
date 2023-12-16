package com.java.eight.programs.strings.words;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;

public class DuplicateWordsAndItsCount {
	public static void main(String[] args) {
		String text = "Bob had had had a better effect on on the teacher";
		
		List<String> words = List.of(text.split(" "));
		
		Map<String, Integer> wordAndItsCounts = words.stream()
		        .collect(Collectors.groupingBy(String::valueOf, Collectors.summingInt(w -> 1)));
		wordAndItsCounts.entrySet().stream().filter(e -> e.getValue()==3).forEach(System.out::println);
		
		ConcurrentMap<String, Integer> freqMap = Arrays
				.asList(text.split("[\\s.]"))
				.parallelStream()
				.filter(s -> !s.isEmpty())
				.collect(Collectors.toConcurrentMap(w -> w.toLowerCase(), w -> 1, Integer::sum));
		System.out.println(freqMap.toString());

		freqMap.forEach((key, value) -> {
			if (value == 3) {
				System.out.println(key + "::" + value);
			}
		});
		
	}
}
