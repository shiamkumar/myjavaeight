package com.java.eight.programs.strings.characters;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SecondNonRepeatedCharacter {
	public static void main(String[] args) {
		
		String str = "abcsdnvsn";
		
		Map<Character, Long> result =  str
				.chars()
				.mapToObj(ch -> (char)ch)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
		
        Optional<Character> firstNonRepeat = result
        		.entrySet()
        		.stream()
        		.filter( (e) -> e.getValue() == 1)
        		.map(e -> e.getKey())
        		.skip(1) 
        		.findFirst();
        if(firstNonRepeat.isPresent()) {
            System.out.println("Second Non Repeated Character: " + firstNonRepeat.get());
        }
        
	}
}
