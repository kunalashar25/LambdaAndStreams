package com.test.lambda.examples.basic;

public class SingleParameter {
	public static void main(String[] args) {
		SayAgain a1 = (s) -> {
			return "Hello " + s;
		};

		System.out.println(a1.say("a1")); // Output: Hello a1

		SayAgain a2 = (s) -> {
			return "Go Away " + s;
		};

		System.out.println(a2.say("a2")); // Output: Go Away a2
	}
}

interface SayAgain {
	public String say(String name);
}