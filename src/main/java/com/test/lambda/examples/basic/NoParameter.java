package com.test.lambda.examples.basic;

public class NoParameter {
	public static void main(String[] args) {
		Sayable s1 = () -> {
			return "Nothing to say";
		};

		System.out.println(s1.say()); // Output: Nothing to say

		Sayable s2 = () -> {
			return "Already said";
		};

		System.out.println(s2.say()); // Output: Already said

		s1 = () -> {
			return "Still nothing to say S1!";
		};

		System.out.println(s1.say()); // Output: Still nothing to say S1!
	}
}

interface Sayable {
	public String say();
}
