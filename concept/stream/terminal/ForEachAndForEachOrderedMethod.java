package com.java.eight.concept.stream.terminal;

import java.util.stream.Stream;

public class ForEachAndForEachOrderedMethod {
	public static void main(String[] args) {
		Stream.of("Cricket", "Football", "Running", "Tennis").forEach(e -> System.out.println("listOfForEach: " + e));
		Stream.of("Cricket", "Football", "Running", "Tennis").forEachOrdered(e -> System.out.println("listOfForEachOrdered: " + e));

		// does not guarantee encounter order.
		Stream.of("Cricket", "Football", "Running", "Tennis").parallel()
				.forEach(e -> System.out.println("listOfForEachParallel: " + e));

		//always guarantee the encounter order.
		Stream.of("Cricket", "Football", "Running", "Tennis").parallel()
				.forEachOrdered(e -> System.out.println("listOfForEachOrderedParallel: " + e));

	}
}
