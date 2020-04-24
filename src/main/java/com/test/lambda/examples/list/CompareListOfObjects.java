package com.test.lambda.examples.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareListOfObjects {

	public static void main(String[] args) {

		List<Products> productList = new ArrayList<>();
		productList.add(new Products(1, "Book", 10.5f));
		productList.add(new Products(2, "Pen", 5f));
		productList.add(new Products(3, "File", 20.2f));

		System.out.println("Initial List:: " + productList);
		// Output: Initial List:: [Products{id=1, name='Book', price=10.5}, Products{id=2, name='Pen', price=5.0}, Products{id=3, name='File', price=20.2}]

		// Sorting list on name
		Collections.sort(productList, (p1, p2) -> {
			return p1.name.compareTo(p2.name);
		});

		System.out.println("Sorted Names:: " + productList);
		// Output: Sorted Names:: [Products{id=1, name='Book', price=10.5}, Products{id=3, name='File', price=20.2}, Products{id=2, name='Pen', price=5.0}]
	}
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
