package com.java.eight.programs.numbers;

import java.util.Arrays;
import java.util.List;

public class SumOfPairNumbers {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(8, 7, 2, 5, 3, 1, 4, 6);
		int target = 10;
		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i) + list.get(j) == target) {
					System.out.println("Pair Of numbers found: " + list.get(i) + "," + list.get(j));
				}
			}
		}
	}
}
