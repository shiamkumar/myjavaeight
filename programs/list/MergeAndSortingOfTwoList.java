package com.java.eight.programs.list;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeAndSortingOfTwoList {
	public static void main(String[] args) {

		List<Integer> arr01 = Arrays.asList(1, 3, 5, 7);
		List<Integer> arr02 = Arrays.asList(2, 4, 6, 8);

		List<Integer> unsortedMergedList = Stream.concat(arr01.stream(), arr02.stream()).collect(Collectors.toList());
		System.out.println("Unsorted Merge List: " + unsortedMergedList);

		List<Integer> sortedMergedList = unsortedMergedList.stream().sorted().collect(Collectors.toList());
		System.out.println("Sorted Merge List: " + sortedMergedList);
	}
}
