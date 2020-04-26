package com.test.streams.examples;

import java.util.ArrayList;
import java.util.List;

public class FindMaxAndMin {
	public static void main(String[] args) {

		List<Product2> productList = new ArrayList<>();
		//Adding Products
		productList.add(new Product2(1, "HP Laptop", 25000f));
		productList.add(new Product2(2, "Dell Laptop", 30000f));
		productList.add(new Product2(6, "Alienware Laptop", 92000f));
		productList.add(new Product2(3, "Lenevo Laptop", 28000f));
		productList.add(new Product2(4, "Sony Laptop", 28000f));
		productList.add(new Product2(5, "Apple Laptop", 90000f));

		// max() method to get max Product price
		Product2 p = productList.stream()
				.max((p1, p2) -> p1.price > p2.price ? 1 : -1).get();

		System.out.println(p.name + " | " + p.price); // Output: Alienware Laptop | 92000.0

		// min() method to get min Product price
		Product2 prod = productList.stream()
				.min((p1, p2) -> p1.price > p2.price ? 1 : -1).get();

		System.out.println(prod.name + " | " + prod.price); // Output: HP Laptop | 25000.0
	}
}

class Product2 {
	int id;
	String name;
	float price;

	Product2(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	// to print list content as string
	@Override
	public String toString() {
		return "Product2{" +
				"id=" + id +
				", name='" + name + '\'' +
				", price=" + price +
				'}';
	}
}
