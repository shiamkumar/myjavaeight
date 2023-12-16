package com.java.eight.concept.functionalinterfaces;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionInterace {
	public static void main(String[] args) {
		 List<Integer> list = List.of(1, 2, 3, 4, 5);
		// Create a function that squares an integer.
		 Function<Integer, Integer> square = x -> x * x;
		 List<Integer> squares = list.stream().map(square).collect(Collectors.toList());
		 System.out.println(squares);
	}
}
