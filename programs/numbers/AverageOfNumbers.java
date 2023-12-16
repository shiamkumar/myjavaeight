package com.java.eight.programs.numbers;

import java.util.Arrays;
import java.util.List;

public class AverageOfNumbers {

	public static void main(String[] args) {
		List<Integer> list 	= Arrays.asList(1, 4, 5, 6);
		double avg = list.stream().mapToInt(e -> e).average().getAsDouble();
		System.out.println("Average Of Numbers:" + avg);
	}

}
