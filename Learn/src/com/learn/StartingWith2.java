package com.learn;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartingWith2 {

	public static void main(String[] args) {
		int inputArray[] = {1,25,34,45,26,26,37};
		
	List<String> wordStartWith2	=Arrays.stream(inputArray).boxed().map(st->st.toString())
		.filter(p->p.startsWith("2")).collect(Collectors.toList());
	System.out.println(wordStartWith2);
	
	
}

}
