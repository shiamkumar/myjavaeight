package com.java.eight.concept.stream.terminal;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ToArrayMethod {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 4, 5, 6);
		Stream<Integer> stream = list.stream();
		Object[] objects = stream.toArray();
		System.out.println(objects[0] + ", " + objects[1] + ", " + objects[2] + ", " + objects[3]);
	}
}
