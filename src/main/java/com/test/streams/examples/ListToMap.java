package com.test.streams.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMap {
	public static void main(String[] args) {
		List<Product5> productsList = new ArrayList<>();

		//Adding Products  
		productsList.add(new Product5(1, "HP Laptop", 25000f));
		productsList.add(new Product5(2, "Dell Laptop", 30000f));
		productsList.add(new Product5(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product5(4, "Sony Laptop", 28000f));
		productsList.add(new Product5(5, "Apple Laptop", 90000f));

		Map<Integer, String> priceMap = productsList.stream()
				.collect(Collectors.toMap(p -> p.id, p -> p.name));

		System.out.println(priceMap);
		// Output: {1=HP Laptop, 2=Dell Laptop, 3=Lenevo Laptop, 4=Sony Laptop, 5=Apple Laptop}

		Map<Integer, Product5> productMap = productsList.stream()
				.collect(Collectors.toMap(p -> p.id, p -> p));

		System.out.println(productMap);
		// Output:
		// {1=Product5{id=1, name='HP Laptop', price=25000.0}, 2=Product5{id=2, name='Dell Laptop', price=30000.0},
		// 3=Product5{id=3, name='Lenevo Laptop', price=28000.0}, 4=Product5{id=4, name='Sony Laptop', price=28000.0},
		// 5=Product5{id=5, name='Apple Laptop', price=90000.0}}

	}
}

class Product5 {
	int id;
	String name;
	float price;

	Product5(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	// to print list content as string
	@Override
	public String toString() {
		return "Product5{" +
				"id=" + id +
				", name='" + name + '\'' +
				", price=" + price +
				'}';
	}
}