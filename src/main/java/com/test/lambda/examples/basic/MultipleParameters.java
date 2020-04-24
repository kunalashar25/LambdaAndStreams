package com.test.lambda.examples.basic;

public class MultipleParameters {
	public static void main(String[] args) {
		Operations o1 = (a, b) -> {
			return a + b;
		};

		System.out.println(o1.perform(2, 3)); // Output: 5

		Operations o2 = (a, b) -> {
			return a * b;
		};

		System.out.println(o2.perform(2, 3)); // Output: 6

		// Without return keyword
		Operations o3 = (a, b) -> (a - b);

		System.out.println(o3.perform(2, 3)); // Output: -1
	}
}

interface Operations {
	public int perform(int a, int b);
}