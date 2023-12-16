package com.java.eight.concept.optional;

import java.util.Optional;

public class OfNullableMethod {
	public static void main(String[] args) {
		int optional1 = Optional.ofNullable(1).get();
        System.out.println("Optional1: " + optional1);

        Optional<String> optional2 = Optional.ofNullable(null);
        System.out.println("\n\nOptional2: " + optional2);
        //System.out.println("Optional2.isPresent: " + optional2.isPresent());
        System.out.println("Optional2.isPresent: " + optional2.get());
	}
}
