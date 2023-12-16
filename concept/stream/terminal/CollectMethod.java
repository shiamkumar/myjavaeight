package com.java.eight.concept.stream.terminal;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectMethod {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Canada", "India", "Austraila", "Bangladesh", "Pakistan");
		//List<Integer> listOfInteger = listOfString.stream().map(Integer::valueOf).collect(Collectors.toList());
		List<String> result = list.stream().map(value -> value.toUpperCase()).collect(Collectors.toList());
		System.out.println("Collect Rfesult: " + result);
	}
}
