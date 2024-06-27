package com.learn.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Suppose you have a list of books, and each book has a list of authors. 
// want to get a list of all unique authors from the books.

class Book {
	private String title;
    private List<String> authors;
	
    public Book(String title, List<String> authors) {
		super();
		this.title = title;
		this.authors = authors;
	}

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<String> getAuthors() {
		return authors;
	}

	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}	
       
}

public class FlatMapping {

	public static void main(String[] args) {
					
		List<Book> books=Arrays.asList( 
				new Book("Book 1",Arrays.asList("Author1","Author2")),
				new Book("Book 2",Arrays.asList("Author2","Author2b")),
				new Book("Book 3",Arrays.asList("Author3","Author3b")));
		List<String> uniqueauthors =books.stream().flatMap(b->b.getAuthors().stream())
		.distinct()
		.collect(Collectors.toList());
		System.out.println(uniqueauthors);
		
	}
}
