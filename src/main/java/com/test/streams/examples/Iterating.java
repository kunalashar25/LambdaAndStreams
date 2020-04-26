package com.test.streams.examples;

import java.util.stream.Stream;

public class Iterating {

	public static void main(String[] args) {
		Stream.iterate(1, e -> e + 1)
				.filter(e -> e % 5 == 0)
				.limit(5)
				.forEach(System.out::println);
	}

	// Output:
	// 5
	// 10
	// 15
	// 20
	// 25
}
