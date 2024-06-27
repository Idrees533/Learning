package com.learn;

import java.util.Arrays;

public class FindLongestString {

	public static void main(String[] args) {
		 String [] arrayInput = {"vivek"  , "kadiyan" , "ram" , "chaudhary vivek kadiyan"};
		 
		String longestString= Arrays.stream(arrayInput).reduce((word1, word2)->word1.length() > word2.length()?word1:word2).get();
	System.out.println(longestString);
	}
}
