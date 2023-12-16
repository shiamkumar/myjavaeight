package com.java.eight.concept.stream.terminal;

import java.util.Arrays;
import java.util.List;

public class SumMethod {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		int result = list.stream().mapToInt(Integer::intValue).sum();
		System.out.println(result);
	}
}
