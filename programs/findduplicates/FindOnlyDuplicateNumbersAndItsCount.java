package com.java.eight.programs.findduplicates;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindOnlyDuplicateNumbersAndItsCount {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(5, 3, 4, 1, 3, 7, 2, 9, 9, 4, 9, 9, 4); // 3,4,9
		Map<Integer, Long> map = list
				.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		map.forEach((key, value) -> {
			if (value > 1) {
				System.out.println(key + " : " + value);
			}
		});
	}
}
