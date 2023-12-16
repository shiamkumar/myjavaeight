package com.java.eight.concept.optional;

import java.util.Optional;

public class isPresentMethod {
	public static void main(String[] args) {
		Optional<String> optionalString = Optional.ofNullable("Hello, world!");

		if (optionalString.isPresent()) {
		  System.out.println(optionalString.get());
		}
	}
}
