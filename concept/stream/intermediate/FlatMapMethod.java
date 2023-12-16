package com.java.eight.concept.stream.intermediate;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapMethod {
	public static void main(String[] args) {
		List<String> devContact = Arrays.asList("7000000021", "7000000022");
		List<String> qaContact = Arrays.asList("9000000034", "9000000035");
		List<List<String>> allContact = Arrays.asList(devContact, qaContact);
		System.out.println("Before flattening is : " + allContact); 
		List<String> listofAllContact = allContact.stream().flatMap(Collection::stream).collect(Collectors.toList()); 
		//List<String> listofAllContact = allContact.stream().flatMap(list -> list.stream()).collect(Collectors.toList()); 
		System.out.println("After flattening is : " + listofAllContact); 
	}
}
