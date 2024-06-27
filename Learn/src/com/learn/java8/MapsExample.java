package com.learn.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Person {
	private String name;
    private List<String> favoriteColors;
	public Person(String name, List<String> favoriteColors) {
		super();
		this.name = name;
		this.favoriteColors = favoriteColors;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getFavoriteColors() {
		return favoriteColors;
	}
	public void setFavoriteColors(List<String> favoriteColors) {
		this.favoriteColors = favoriteColors;
	}
    
    
	

}
 
public class MapsExample {
public static void main(String[] args) {
	
	
				List<Person> people=Arrays.asList(
						new Person("Alice", Arrays.asList("Red","Blue")),
						new Person("Bob", Arrays.asList("Green","Cream")),
						new Person("Charle",Arrays.asList("Black","White")));
				
				//get the all the colour
						
			List<List<String>> colours	=people.stream().map(Person::getFavoriteColors).collect(Collectors.toList());
				
				System.out.println(colours);
				
				//flatMap
				List<String>	allColours		=	people.stream().flatMap(person->person.getFavoriteColors().stream())
								.collect(Collectors.toList());
				System.out.println("List of allcolours: "+allColours);
}
	
}
