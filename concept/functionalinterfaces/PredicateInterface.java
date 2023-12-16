package com.java.eight.concept.functionalinterfaces;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateInterface {
	public static void main(String[] args) {
		List<Integer> list = List.of(1, 2, 3, 4, 5);
		// Create a predicate that checks if an integer is even.
	    Predicate<Integer> isEven = x -> x % 2 == 0;
	    List<Integer> evenNumbers = list.stream().filter(isEven).collect(Collectors.toList());
	    System.out.println(evenNumbers);
	}
}
