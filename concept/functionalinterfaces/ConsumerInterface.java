package com.java.eight.concept.functionalinterfaces;

import java.util.function.Consumer;

public class ConsumerInterface {
	public static void main(String[] args) {
		Consumer<String> consumer = (s) -> System.out.println(s.toUpperCase());
		consumer.accept("hello world");
	}
}
