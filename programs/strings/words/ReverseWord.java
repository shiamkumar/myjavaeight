package com.java.eight.programs.strings.words;

public class ReverseWord {
	public static void main(String[] args) {
		String str = "java coding is very easy";
		String[] splitStr = str.split(" ");
		String result = "";
		
		for(int i=splitStr.length-1; i>=0; i--) {
			result = result + splitStr[i] + " ";
		}
		System.out.println("Reversed String: "+result);
	}
}
