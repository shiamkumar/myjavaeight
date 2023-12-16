package com.java.eight.concept.stream.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SkipMethod {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> result = list.stream().skip(3).collect(Collectors.toList());
		System.out.println("Skip Result: " + result);
	}
}
