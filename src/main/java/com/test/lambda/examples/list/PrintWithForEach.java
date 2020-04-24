package com.test.lambda.examples.list;

import java.util.ArrayList;
import java.util.List;

public class PrintWithForEach {

	public static void main(String[] args) {

		List<String> nameList = new ArrayList<>();
		nameList.add("name5");
		nameList.add("name3");
		nameList.add("name2");
		nameList.add("name4");
		nameList.add("name1");

		// to print all the names
		nameList.forEach(n -> System.out.println(n));

		// Output:
		// name5
		// name3
		// name2
		// name4
		// name1
	}
}
