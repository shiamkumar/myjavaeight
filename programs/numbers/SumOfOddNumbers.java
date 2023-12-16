package com.java.eight.programs.numbers;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumOfOddNumbers {
	public static void main(String[] args) {
		List<Integer> list2 = Arrays.asList(1, 4, 5, 6); // filter() -> Predicate
		Optional<Integer> oddSum = list2.stream().filter(a -> a % 2 != 0).reduce((a, b) -> a + b);
		System.out.println("Sum Of Odd Numbers:" + oddSum);
	}
}
