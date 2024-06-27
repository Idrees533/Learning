package com.learn;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class OptionalNullPointerExceptin {

	public static void main(String[] args) {
		
		Employee eobj=new Employee();
		
		OptionalNullPointerExceptin.getCity(eobj);
		
	}
	
	//fetch the city
public static String getCity(Employee e) {
					
	String optionalCity=Optional.ofNullable(e.getAddress())
					.map(Address::getCity ).orElse("Address is null");
			
	/*
	 * Optional<String> city
	 * =Optional.ofNullable(Optional.ofNullable(e.getAddress().getCity())
	 * .orElseThrow(()->new NullPointerException("Address null")));
	 */
	return optionalCity;
			//city.orElse("unknow"); String city=e.getAddress().getCity()
	}
	
}

class Employee {
	private String name;
	private Address  address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
}

class Address {
	String city;

	public  String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	
	
}