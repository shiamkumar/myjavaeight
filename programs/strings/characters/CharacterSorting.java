package com.java.eight.programs.strings.characters;

import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CharacterSorting {
	public static void main(String[] args) {
		String str = "welcome";
		String charSortingAsc = Stream.of(str.split("")).sorted().collect(Collectors.joining());
		System.out.println("charSortingAsc: " + charSortingAsc);
		
		String charSortingDesc = Stream.of(str.split("")).sorted(Collections.reverseOrder()).collect(Collectors.joining());
		System.out.println("charSortingDesc: " + charSortingDesc);
	}
}
