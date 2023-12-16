package com.java.eight.programs.numbers;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumOfEvenNumbers {
	public static void main(String[] args) {
		List<Integer> list3 = Arrays.asList(1, 4, 5, 6);
		Optional<Integer> evenSum = list3.stream().filter(a -> a % 2 == 0).reduce((a, b) -> a + b);
		System.out.println("Sum Of Even Numbers:" + evenSum);
	}
}
