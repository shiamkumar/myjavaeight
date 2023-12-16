package com.java.eight.programs.numbers;

import java.util.Arrays;
import java.util.List;

public class SecondLowestNumber {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(4, 5, 6, 2, 56, 27, 78, 92, 34, 43, 4);
		int secondLowestNumber = list.stream().sorted().distinct().skip(1).findFirst().get();
		System.out.println("Second Lowest Number:" + secondLowestNumber);
	}
}
