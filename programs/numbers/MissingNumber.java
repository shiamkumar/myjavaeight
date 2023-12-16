package com.java.eight.programs.numbers;

import java.util.Arrays;

public class MissingNumber {
	public static void main(String[] args) {
		int[] list = { 1, 2, 3, 5, 6, 7, 8, 9 };
		int max = Arrays.stream(list).max().getAsInt();
		int expected = max * (max + 1) / 2;
		int actual = Arrays.stream(list).sum();
		int missingNumber = expected - actual;
		//System.out.println("expected: " + expected);
		//System.out.println("actual: " + actual);
		System.out.println("Missing Number:" + missingNumber);
	}
}
