package com.java.eight.concept.stream.terminal;

import java.util.Arrays;
import java.util.List;

public class CountMethod {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		long result = list.stream().count();
		System.out.println(result);
	}
}
