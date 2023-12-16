package com.java.eight.programs.strings.characters;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/*String s ="The history of JAVA is very interesting";
Top 5 Characters  based on Occurrence(ignore space)*/
public class Top5CharactersBasedOnOccurrence {
	public static void main(String[] args) {

		String str = "The history of JAVA is very interesting";

		Map<Character, Long> charOccurence = str
				.chars()
				.map(Character::toLowerCase)
				.mapToObj(ch -> (char) ch)
				.filter(e -> e != ' ')
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("Character Occurences: " + charOccurence);

		Map<Character, Long> sortedCharOccurence = charOccurence
				.entrySet()
				.stream()
				.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				.limit(5)
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue, LinkedHashMap::new));
		System.out.println("Sorted Repeated Character: " + sortedCharOccurence);

	}
}
