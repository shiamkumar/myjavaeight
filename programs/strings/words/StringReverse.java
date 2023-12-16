package com.java.eight.programs.strings.words;

public class StringReverse {
	public static void main(String[] args) {
		
		String stringClazz = reverseUsingStringClass();
		System.out.println(stringClazz);
		
		String toCharArray = reverseUsingToCharArray();
		System.out.println(toCharArray);
		
		String stringSplit = reverseUsingSplit();
		System.out.println(stringSplit);
		
		String str = "google";
		String recursive = reverseUsingRecursive(str);
		System.out.println(recursive);
		
	}

	public static String reverseUsingStringClass() {
		String text = "google";
		String strRev = "";
		for (int i = text.length() - 1; i >= 0; i--) {
			strRev = strRev + text.charAt(i);
		}
		return strRev;
	}

	public static String reverseUsingToCharArray() {
		String text = "google";
		String strRev = "";
		char[] charArr = text.toCharArray();
		for (int i = charArr.length - 1; i >= 0; i--) {
			strRev = strRev + charArr[i];
		}
		return strRev;
	}
	
	public static String reverseUsingSplit() {
		String text = "google";
		String strRev = "";
		String[] strArr = text.split("");
		for (int i = strArr.length - 1; i >= 0; i--) {
			strRev = strRev + strArr[i];
		}
		return strRev;
	}

	public static String reverseUsingRecursive(String text) {
		if ((text == null) || (text.length() <= 1))
			return text;
		else {
			return reverseUsingRecursive(text.substring(1)) + text.charAt(0);
		}
	}

}
