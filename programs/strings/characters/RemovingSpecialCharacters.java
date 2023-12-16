package com.java.eight.programs.strings.characters;

public class RemovingSpecialCharacters {
	public static void main(String[] args) {
		String text = "It%cont#ains^special*char\'s&.";

		String result01 = text.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println("result01: "+ result01);

		String result02 = text.replaceAll("[#%^*&.\t\b\n\r\f]*", "");
		System.out.println("result02: "+ result02);

		String result03 = text.replaceAll("\\W", " ");
		System.out.println("result03: "+ result03);

		String result04 = "";
		for (int i = 0; i < text.length(); i++) {
			if ((text.charAt(i) > 64 && text.charAt(i) <= 90) || (text.charAt(i) > 96 && text.charAt(i) <= 122)) {
				result04 = result04 + text.charAt(i);
			}
		}
		System.out.println("result04: "+ result04);
		
		
		int[] charArr = text
				.codePoints()
				.filter(ch -> Character.isAlphabetic(ch) || Character.isDigit(ch))
				.toArray();
		System.out.println("result05: " + new String(charArr, 0, charArr.length));
	}
}
