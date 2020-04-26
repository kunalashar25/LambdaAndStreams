package com.test.streams.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FilteringCollection {

	public static void main(String[] args) {

		List<Product> productList = new ArrayList<>();
		productList.add(new Product(1, "Samsung A5", 27000f));
		productList.add(new Product(3, "Iphone 6S", 65000f));
		productList.add(new Product(2, "Sony Xperia", 25000f));
		productList.add(new Product(4, "Nokia Lumia", 15000f));
		productList.add(new Product(5, "Redmi4 ", 26000f));
		productList.add(new Product(6, "Lenevo Vibe", 19000f));
		productList.add(new Product(1, "Lenevo Vibe", 29000f));

		// printing phone price >20K
		List<Float> newList = productList.stream()
				.filter(p -> p.price > 20000f) // filter condition
				.map(p -> p.price) //fetching price
				.collect(Collectors.toList()); // collecting as list

		System.out.println(newList); // Output: [27000.0, 65000.0, 25000.0, 26000.0, 29000.0]

		// printing phone name with price >20K
		List<String> newList2 = productList.stream()
				.filter(p -> p.price > 20000f) // filter condition
				.map(p -> p.name) //fetching name
				.collect(Collectors.toList()); // collecting as list

		System.out.println(newList2); // Output: [Samsung A5, Iphone 6S, Sony Xperia, Redmi4 , Lenevo Vibe]

		// to print set of id with filter condition
		Set<Integer> uniqueId = productList.stream()
				.filter(p -> p.price > 20000f)
				.map(p -> p.id)
				.collect(Collectors.toSet());

		System.out.println(uniqueId); // Output: [1, 2, 3, 5]

		// to print set of id without filter condition
		Set<Integer> id = productList.stream()
				.map(p -> p.id)
				.collect(Collectors.toSet());

		System.out.println(id); // Output: [1, 2, 3, 4, 5, 6]

	}
}

class Product {
	int id;
	String name;
	float price;

	Product(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	// to print list content as string
	@Override
	public String toString() {
		return "Product{" +
				"id=" + id +
				", name='" + name + '\'' +
				", price=" + price +
				'}';
	}
}
