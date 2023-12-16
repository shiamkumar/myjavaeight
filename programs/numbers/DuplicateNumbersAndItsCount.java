package com.java.eight.programs.numbers;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateNumbersAndItsCount {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(11, 22, 33, 44, 55, 33, 22, 33);
		Map<Integer, Long> map01 = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("Duplicate Numbers And Its Count:" + map01);
	}
}
