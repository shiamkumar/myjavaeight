package com.java.eight.concept.stream.terminal;

import java.util.Arrays;
import java.util.List;

public class nonMatchAndAnyMatchMethod {
	public static void main(String[] args) {
	    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
	    boolean noneMatch = list.stream().noneMatch(n -> n % 2 == 0);
	    System.out.println("noneMatch: "+noneMatch);
	    boolean anyMatch = list.stream().anyMatch(n -> n % 2 == 0);
	    System.out.println("anyMatch: "+anyMatch);
	}
}
