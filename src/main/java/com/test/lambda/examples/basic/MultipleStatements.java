package com.test.lambda.examples.basic;

public class MultipleStatements {

	public static void main(String[] args) {
		Speak s = (t) -> {
			String s1 = "Hi There! ";
			String s2 = "How you doing, ";
			String s3 = "?";
			return s1 + s2 + t + s3;
		};

		System.out.println(s.print("Lambda")); // Output: Hi There! How you doing, Lambda?

	}
}

interface Speak {
	public String print(String text);
}
