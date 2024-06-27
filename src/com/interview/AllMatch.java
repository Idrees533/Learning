package com.interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class AllMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating a list of Integers
	    List<Integer> list = Arrays.asList(3, 6, 9, 12, 21);
	     
	  boolean result = list.stream().allMatch(p-> p % 3 == 0);
	  System.out.println("result: "+result);
	  
	  Stream<String> stream = Stream.of("Geeks", "in", 
              "GeeksQuiz", "GeeksforGeeks");
	  
	 boolean ans=stream.allMatch(s->s.length() > 2);
	 System.out.println("answer "+ans);


	}

}
