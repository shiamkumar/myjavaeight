package com.java.eight.concept.stream.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctMethod {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 3, 4);
		List<Integer> result = list.stream().distinct().collect(Collectors.toList());
		System.out.println("Distinct Result: " + result);
	}
}
