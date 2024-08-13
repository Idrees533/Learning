package com.code.interview.wipro;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterPalindrome {

	public static void main(String[] args) {
		
		List<String> words=Arrays.asList("madam","hello","radar","car");
		
		List<String> palindrome =filterPalindrome(words);
		System.out.println("Palinderome list : "+palindrome);
	}

	//filtering Palindrome and collect in list form
	public static List<String> filterPalindrome(List<String> words) {
		// TODO Auto-generated method stub
		return words.stream().filter(word->isPalindrome(word))
				.collect(Collectors.toList());
	}

	//using String builder evalate the String word 
	public static boolean isPalindrome(String word) {
		// TODO Auto-generated method stub
		String reversed=new StringBuilder(word).reverse().toString();
		return reversed.equals(word);
	}
}
