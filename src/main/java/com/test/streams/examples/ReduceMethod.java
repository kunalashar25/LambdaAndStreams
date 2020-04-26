package com.test.streams.examples;

import java.util.ArrayList;
import java.util.List;

public class ReduceMethod {

	public static void main(String[] args) {
		List<Product1> productList = new ArrayList<>();
		//Adding Products
		productList.add(new Product1(1, "HP Laptop", 25000f));
		productList.add(new Product1(2, "Dell Laptop", 30000f));
		productList.add(new Product1(3, "Lenevo Laptop", 28000f));
		productList.add(new Product1(4, "Sony Laptop", 28000f));
		productList.add(new Product1(5, "Apple Laptop", 90000f));

		// This is more compact approach for filtering data
		Float totalPrice = productList.stream()
				.map(p -> p.price)
				.reduce(0.0f, (sum, price) -> sum + price);  // accumulating price
		System.out.println(totalPrice); // Output: 201000.0

		// More precise code
		float totalPrice2 = productList.stream()
				.map(p -> p.price)
				.reduce(0.0f, Float::sum);   // accumulating price, by referring method of Float class
		System.out.println(totalPrice2); // Output: 201000.0
	}
}

class Product1 {
	int id;
	String name;
	float price;

	Product1(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	// to print list content as string
	@Override
	public String toString() {
		return "Product1{" +
				"id=" + id +
				", name='" + name + '\'' +
				", price=" + price +
				'}';
	}
}

