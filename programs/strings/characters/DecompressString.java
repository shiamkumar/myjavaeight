package com.java.eight.programs.strings.characters;

public class DecompressString {
	public static void main(String[] args) {
		String str = "A2B4C1D3";

		StringBuilder result = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			if (Character.isAlphabetic(str.charAt(i))) {
				result.append(str.charAt(i));
			} else {
				int x = Character.getNumericValue(str.charAt(i));
				for (int j = 1; j < x; j++) {
					result.append(str.charAt(i - 1));
				}
			}
		}
		System.out.println(result.toString());
	}
}
