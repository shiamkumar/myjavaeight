package com.java.eight.concept.optional;

import java.util.Optional;

public class OfMethod {
	public static void main(String[] args) {
		
		int optional1 = Optional.ofNullable(1).get();
        System.out.println("Optional1: " + optional1);
        
        Optional<String> optional2 = Optional.of(null);
        System.out.println("Optional2: " + optional2);

        
	}
}
