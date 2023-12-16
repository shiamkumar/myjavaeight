package com.java.eight.programs.strings.words;

import java.util.Arrays;

public class StringAnagram {
	public static void main(String[] args) {
		String str1 = "race";
		String str2 = "care";
		boolean result = anagramCheck(str1, str2);
		System.out.println(result);
	}
	
	public static boolean anagramCheck(String str1, String str2) {
		char[] charArr1 = str1.replaceAll("[\\s]", "").toLowerCase().toCharArray();
	    char[] charArr2 = str2.replaceAll("[\\s]", "").toLowerCase().toCharArray();
	    
	    Arrays.sort(charArr1);
	    Arrays.sort(charArr2);
		return(Arrays.equals(charArr1, charArr2));
	}
	
}
