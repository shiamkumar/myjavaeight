package com.java.eight.concept.stream.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PeekMethod { 
	public static void main(String[] args) {
		List<String> list = Arrays.asList("one", "two", "three", "four");
		
		//support debugging, where you want to see the elements
		list.stream()
			.filter(e -> e.length() > 3)
			.peek(e -> System.out.println("Filtered value: " + e))
			.map(String::toUpperCase)
			.peek(e -> System.out.println("Mapped value: " + e))
			.collect(Collectors.toList());
		
		// when we want to alter the inner state of an element. 
		List<User> listOfUser = Arrays.asList(new User("Scott"), new User("Tiger"), new User("Alice"));
		Stream<User> result = listOfUser.stream().peek(u -> u.setName(u.getName().toLowerCase()));
		result.forEach(System.out::println);
	}
}

class User {
	private String name;

	public User(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [name=" + name + "]";
	}
}
