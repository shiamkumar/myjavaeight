package com.java.eight.concept.optional;

import java.util.Optional;

public class ifPresentMethod {
	public static void main(String[] args) {
		Optional<String> optionalString = Optional.ofNullable("Hello, world!");

		optionalString.ifPresent(System.out::println);
	}
}
