package com.java.eight.programs.numbers;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateNumbers {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 4, 5, 6, 2, 2, 56, 27, 78, 5, 56);
		Set<Integer> duplicateNumbers01 = list.stream()
				.filter(e -> Collections.frequency(list, e) > 1)
				.collect(Collectors.toSet());
		System.out.println("Duplicate Numbers:" + duplicateNumbers01);

		Set<Integer> duplicates = new HashSet<Integer>();
		Set<Integer> duplicateNumbers02 = list.stream().filter(e -> !duplicates.add(e)).collect(Collectors.toSet());
		System.out.println("Duplicate Numbers:" + duplicateNumbers02);
	}
}
