package com.java.eight.programs.numbers;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondHighestNumber {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(4, 5, 6, 2, 56, 27, 78, 92, 34, 43);
		int secondHighestNumber = list.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();
		System.out.println("Second Highest Number:" + secondHighestNumber);
	}
}
