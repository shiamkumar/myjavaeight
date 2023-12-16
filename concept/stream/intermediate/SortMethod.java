package com.java.eight.concept.stream.intermediate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortMethod {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(5, 3, 4, 2, 1);
		List<Integer> resultAsc = list.stream().sorted().collect(Collectors.toList());
		System.out.println("Ascending Order: " + resultAsc);

		List<Integer> resultDesc = list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println("Descending Order: " + resultDesc);
	}
}
