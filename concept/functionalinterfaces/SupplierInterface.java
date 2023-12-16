package com.java.eight.concept.functionalinterfaces;

import java.util.function.Supplier;

public class SupplierInterface {
	public static void main(String[] args) {
        Supplier<String> supplier = () -> "hello world";
        System.out.println(supplier.get());
	}
}
