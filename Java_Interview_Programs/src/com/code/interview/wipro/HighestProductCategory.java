package com.code.interview.wipro;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Product {
	int id;
	String name;
	String category;
	Long price;
	public Product(int id, String name, String category, Long price) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Long getPrice() {
		return price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", category=" + category + ", price=" + price + "]";
	}
	
	
}

public class HighestProductCategory {

	public static void main(String[] args) {
		Product p1 = new Product(1,"Laptop","Electronics",50000L);
        Product p2 = new Product(2,"mobile","Electronics",25000L);
        Product p3 = new Product(3,"owen","kitchen Applicans",5000L);
        Product p4 = new Product(4,"Coffee Maker","kitchen Applicans",2000L);
        Product p5 = new Product(5,"T-Shirt","Clothings",2000L);
        Product p6 = new Product(6,"Sneakers","Clothings",2000L);
        List<Product> productsList = new ArrayList<>(List.of(p1, p2, p3, p4, p5, p6));
        
        productsList.stream().collect(Collectors.groupingBy(Product::getCategory,
        		Collectors.maxBy(Comparator.comparing(Product::getPrice))))
        .entrySet().stream().forEach((k)->System.out.println(k.getKey()+ " "+k.getValue()));
	}
}
