package com.example.solugenix;

import java.util.Arrays;

public class AnagramProgram {

	public static void main(String[] args) {
		
		String s1="racecar";
		String s2="racecar";
		// check the length of string
		
		if(s1.length()==s2.length()) {
			
		// convert string to char array
			
	char[] char1=s1.toCharArray();
	char[] char2=s2.toCharArray();
	
	// sort the char array
		Arrays.sort(char1);
		Arrays.sort(char2);
		
		
		//Arrays.equals(null, null)
	//evaluate the boolean type
			boolean result= Arrays.equals(char1, char2);
			
			if(result) {
				System.out.println("string is anagram");
			} else {
				System.out.println("string is not anagram");
			}
		
			//System.out.println("String not aanagram");
		}
	}
}
