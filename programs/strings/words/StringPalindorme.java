package com.java.eight.programs.strings.words;

public class StringPalindorme {
	public static void main(String[] args) {
		String text = "radar";
		String strRev = "";
		for (int i = text.length() - 1; i >= 0; i--) {
			strRev = strRev + text.charAt(i);
		}
		String result = (text.equals(strRev)) ? "Palindrome" : "Not a Palindrome";
		System.out.println(text + " is a " + result);
	}
}
