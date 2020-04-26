package com.test.streams.examples;

import java.util.ArrayList;
import java.util.List;

public class CountMethod {

	public static void main(String[] args) {
		List<Product3> productList = new ArrayList<>();
		//Adding Products
		productList.add(new Product3(1, "HP Laptop", 25000f));
		productList.add(new Product3(2, "Dell Laptop", 30000f));
		productList.add(new Product3(3, "Lenevo Laptop", 28000f));
		productList.add(new Product3(4, "Sony Laptop", 28000f));
		productList.add(new Product3(5, "Apple Laptop", 90000f));

		long count = productList.stream()
				.filter(p -> p.price <= 28000f)
				.count();
		System.out.println("Total items under 28K:: " + count);
		// Output: Total items under 28K:: 3
	}
}

class Product3 {
	int id;
	String name;
	float price;

	Product3(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	// to print list content as string
	@Override
	public String toString() {
		return "Product3{" +
				"id=" + id +
				", name='" + name + '\'' +
				", price=" + price +
				'}';
	}
}
