package com.java.eight.programs.list;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommonElementsOfTwoList {
	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("Apple", "Mango", "Grapes", "Banana");
		List<String> list2 = Arrays.asList("Apple", "Mango", "Berrys", "Guava");
		List<String> commonElements = list1.stream()
				  .filter(list2::contains)
				//.filter(item -> list2.contains(item))
				  .collect(Collectors.toList());
		System.out.println("Common Elements From 2 List:: "+commonElements);
	}
}
