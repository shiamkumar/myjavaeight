package com.java.eight.concept.stream.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LimitMethod {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> result = list.stream().limit(3).collect(Collectors.toList());
		System.out.println("Limit Result: " + result);
	}
}
