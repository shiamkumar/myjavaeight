package com.java.eight.programs.numbers;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinimumNumber {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(4, 5, 6, 2, 56, 27, 78, 5, 78); 
		int minNumber = list.stream().min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("Min Number:" + minNumber);
	}
}
