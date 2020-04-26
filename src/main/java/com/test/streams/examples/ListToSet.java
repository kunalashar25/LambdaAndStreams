package com.test.streams.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ListToSet {

	public static void main(String[] args) {
		List<Product4> productsList = new ArrayList<>();

		//Adding Products  
		productsList.add(new Product4(1, "HP Laptop", 25000f));
		productsList.add(new Product4(2, "Dell Laptop", 30000f));
		productsList.add(new Product4(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product4(4, "Sony Laptop", 28000f));
		productsList.add(new Product4(5, "Apple Laptop", 90000f));

		Set<Float> uniquePriceList = productsList.stream()
				.filter(p -> p.price < 30000f)
				.map(p -> p.price)
				.collect(Collectors.toSet());

		System.out.println(uniquePriceList); // Output: [25000.0, 28000.0]
	}
}

class Product4 {
	int id;
	String name;
	float price;

	Product4(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	// to print list content as string
	@Override
	public String toString() {
		return "Product4{" +
				"id=" + id +
				", name='" + name + '\'' +
				", price=" + price +
				'}';
	}
}
