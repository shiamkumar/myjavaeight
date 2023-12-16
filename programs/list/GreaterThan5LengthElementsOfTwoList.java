package com.java.eight.programs.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GreaterThan5LengthElementsOfTwoList {
	public static void main(String[] args) {
		
		List<String> list1 = Arrays.asList("Apple", "Mango", "Grapes", "Banana");
		List<String> list2 = Arrays.asList("Apple", "Mango", "Berrys", "Orange");

		List<String> GeraterThanElements1 = list1.stream()
			.filter(item -> item.length() > 5)
            .collect(Collectors.toList());
		System.out.println("GeraterThanElements1: " + GeraterThanElements1);
		
		List<String> GeraterThanElements2 = list2.stream()
            .filter(item -> item.length() > 5)
            .collect(Collectors.toList());
		System.out.println("GeraterThanElements2: " + GeraterThanElements2);
		
		List<String> result = new ArrayList<>();
		result.addAll(GeraterThanElements1);
		result.addAll(GeraterThanElements2);
		System.out.println("All Gerater Than 5 Elements: "+ result);
		
	}
}
