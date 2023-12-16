package com.java.eight.programs.strings.words;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class WordSorting {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("John", "Anbu", "Lux", "David", "Peter");	
		List<String> sortedNamesInAsc = list.stream().sorted().collect(Collectors.toList());
		System.out.println("Sorted Names In Ascending Order:" + sortedNamesInAsc);
		
		List<String> sortedNamesInDesc = list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println("Sorted Names In Descending Order:" + sortedNamesInDesc);
		
	}
}
