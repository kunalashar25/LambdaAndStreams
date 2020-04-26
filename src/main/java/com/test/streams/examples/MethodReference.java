package com.test.streams.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MethodReference {
	public static void main(String[] args) {
		List<Product6> productsList = new ArrayList<>();

		//Adding Products  
		productsList.add(new Product6(1, "HP Laptop", 25000f));
		productsList.add(new Product6(2, "Dell Laptop", 30000f));
		productsList.add(new Product6(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product6(4, "Sony Laptop", 28000f));
		productsList.add(new Product6(5, "Apple Laptop", 90000f));

		List<Float> priceList = productsList.stream()
				.filter(p -> p.price >= 30000f)
				.map(Product6::getPrice)
				.collect(Collectors.toList());

		System.out.println(priceList); // Output: [30000.0, 90000.0]
	}
}

class Product6 {
	int id;
	String name;
	float price;

	public Product6(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public float getPrice() {
		return price;
	}
}
