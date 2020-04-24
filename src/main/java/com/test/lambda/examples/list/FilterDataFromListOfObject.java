package com.test.lambda.examples.list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FilterDataFromListOfObject {

	public static void main(String[] args) {
		List<Product> productList = new ArrayList<>();
		productList.add(new Product(1, "Samsung A5", 17000f));
		productList.add(new Product(3, "Iphone 6S", 65000f));
		productList.add(new Product(2, "Sony Xperia", 25000f));
		productList.add(new Product(4, "Nokia Lumia", 15000f));
		productList.add(new Product(5, "Redmi4 ", 26000f));
		productList.add(new Product(6, "Lenevo Vibe", 19000f));

		Stream<Product> filteredData = productList.stream().filter(p -> p.price > 25000f);

		filteredData.forEach(product -> System.out.println(product));
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