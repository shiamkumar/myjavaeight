package com.java.eight.concept.stream.terminal;

import java.util.Arrays;
import java.util.List;

public class AverageMethod {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		double result = list.stream().mapToInt(Integer::intValue).average().getAsDouble();
		System.out.println(result);
	}
}
