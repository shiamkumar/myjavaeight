package com.java.eight.programs.numbers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberStartsWith {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 4, 5, 6, 2, 22, 222, 567, 432, 234);
		List<Integer> numberStartsWith2 = list.stream().map(e -> String.valueOf(e)).filter(e -> e.startsWith("2"))
				.map(Integer::valueOf).collect(Collectors.toList());
		System.out.println("NumberStartsWith: " + numberStartsWith2);
	}
}
