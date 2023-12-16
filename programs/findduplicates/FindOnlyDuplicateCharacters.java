package com.java.eight.programs.findduplicates;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindOnlyDuplicateCharacters {
	public static void main(String[] args) {
		String str = "helloworld";

		Set<String> items = new HashSet<>();
		Set<String> resultUsingSet = 
			Arrays.stream(str.split(""))
			.filter(e -> !items.add(e))
			.collect(Collectors.toSet());
		System.out.println("Duplicate Elements using Set: "+resultUsingSet);
		

		Set<String> resultUsingGroupingBy = Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))    
				.entrySet().stream()                 
				.filter(m -> m.getValue() > 1)       
				.map(Map.Entry::getKey)
				.collect(Collectors.toSet());
		System.out.println("Duplicate Elements using gruopingBy: "+resultUsingGroupingBy);
		
	}
}
