package com.java.eight.programs.strings.words;

import java.util.stream.IntStream;

public class StringPermutations {
	public static void main(String[] args) {
		System.out.println();
		stringPermuteAndPrint01("", "AB");
		System.out.println();
		stringPermuteAndPrint02("", "XYZ");
	}

	public static void stringPermuteAndPrint01(String prefix, String str) {
		int n = str.length();
		if (n == 0) {
			System.out.print(prefix + " ");
		} else {
			for (int i = 0; i < n; i++) {
				stringPermuteAndPrint01(prefix + str.charAt(i), str.substring(i + 1, n) + str.substring(0, i));
			}
		}
	}
	
	private static void stringPermuteAndPrint02(String prefix, String str) {
		int n = str.length();
		if (n == 0) {
			System.out.print(prefix + " ");
		} else {
			IntStream.range(0, n).parallel().forEach(i -> stringPermuteAndPrint02(prefix + str.charAt(i),
					str.substring(i + 1, n) + str.substring(0, i)));
		}
	}
	
}
