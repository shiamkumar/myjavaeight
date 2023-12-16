package com.java.eight.concept.stream.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterMethod {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("java", "j2ee", "c", "python");
		List<String> result =list.stream().filter(e -> e.startsWith("j")).collect(Collectors.toList());
		result.forEach(System.out::println);  
	}
}
