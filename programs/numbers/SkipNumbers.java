package com.java.eight.programs.numbers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SkipNumbers { //After N Numbers
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(4, 5, 6, 2, 56, 27, 78, 92, 34, 43);
		List<Integer> skipedNumbers = list.stream().skip(5).collect(Collectors.toList());
		System.out.println("Skiped Numbers:" + skipedNumbers);
		
		Integer sum = list.stream().skip(5).reduce((a,b) -> a+b).get();
		System.out.println("Sum: " + sum);
	}
}
