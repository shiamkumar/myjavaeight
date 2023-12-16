package com.java.eight.concept.stream.terminal;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceMethod {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 4, 5, 6);
		Optional<Integer> sum = list.stream().reduce((a, b) -> a + b);
		System.out.println("Sum Of All Numbers:" + sum.get());
	}
}
