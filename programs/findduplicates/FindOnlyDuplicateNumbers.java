package com.java.eight.programs.findduplicates;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindOnlyDuplicateNumbers {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(5, 3, 4, 1, 3, 7, 2, 9, 9, 4); // 3,4,9
		
		
		Set<Integer> items = new HashSet<>();
		Set<Integer> resultUsingSet = list
			.stream()
			.filter(e -> !items.add(e))
			.collect(Collectors.toSet());
		System.out.println("Duplicate Elements using Set: "+resultUsingSet);
		
		
		Set<Integer> resultUsingGroupingBy = list.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))    
				.entrySet().stream()                 
				.filter(m -> m.getValue() > 1)       
				.map(Map.Entry::getKey)
				.collect(Collectors.toSet());
		System.out.println("Duplicate Elements using gruopingBy: "+resultUsingGroupingBy);
		
	}
}
