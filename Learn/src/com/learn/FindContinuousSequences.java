package com.learn;

import java.util.Arrays;

public class FindContinuousSequences {
	public static void main(String[] args) {
		String []input= {"1", "2","3","5","9", "a", "6", "7" ,"8" ,"4" ,"@", "-5", "-7" ,"-3", "-2" ,"-1"};
		Arrays.stream(input).filter(p-> {
			boolean out=true;
			try {
				Integer.valueOf(p);
			}
			catch (Exception e) {
				// TODO: handle exception
				out=false;
			}
			return out;
		}).mapToInt(element->Integer.valueOf(element)).toArray();
		
		for(int i=0;i<input.length;i++) {
			System.out.println(input[i]);
		}
		
		
		
		
	}

}
