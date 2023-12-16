package com.java.eight.concept.stream.terminal;

import java.util.Arrays;
import java.util.List;

public class FindFirstAndFindAnyMethod {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Cricket", "Football", "Running", "Tennis");
		
		String findFirst = list.stream().findFirst().get();
		System.out.println("findFirst: "+findFirst);
		String findAny = list.stream().findAny().get();
		System.out.println("findAny: "+findAny);
		
		//It guarantees that it will always return the first element in the stream
		String findFirstParallel = list.stream().parallel().findFirst().get();
		System.out.println("findFirstParallel: "+findFirstParallel);
		
		// it will return you the first value but its not guaranteed
		String findAnyParallel = list.stream().parallel().findAny().get();
		System.out.println("findAnyParallel: "+findAnyParallel);
	}
}
