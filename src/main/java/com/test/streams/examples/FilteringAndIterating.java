package com.test.streams.examples;

import java.util.ArrayList;
import java.util.List;

public class FilteringAndIterating {
	public static void main(String[] args) {

		List<Products> productsList = new ArrayList<>();
		//Adding Products
		productsList.add(new Products(1, "HP Laptop", 25000f));
		productsList.add(new Products(2, "Dell Laptop", 30000f));
		productsList.add(new Products(3, "Lenevo Laptop", 28000f));
		productsList.add(new Products(4, "Sony Laptop", 28000f));
		productsList.add(new Products(5, "Apple Laptop", 90000f));

		productsList.stream()
				.filter(p -> p.price > 28000f)
				.forEach(p -> System.out.println(p.name));
	}
	// Output:
	// Dell Laptop
	// Apple Laptop
}

class Products {
	int id;
	String name;
	float price;

	Products(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	// to print list content as string
	@Override
	public String toString() {
		return "Products{" +
				"id=" + id +
				", name='" + name + '\'' +
				", price=" + price +
				'}';
	}
}
