package com.java.eight.programs.numbers;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortNumbers {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(4, 5, 6, 2, 56, 27, 78, 5, 78);
		List<Integer> sortedNumbersInAsc = list.stream().sorted().collect(Collectors.toList());
		System.out.println("Sorted Numbers in Ascending Order:" + sortedNumbersInAsc);

		List<Integer> sortedNumbersInDesc = list.stream().sorted(Collections.reverseOrder())
				.collect(Collectors.toList());
		System.out.println("Sorted Numbers in Descending Order:" + sortedNumbersInDesc);
	}
}
