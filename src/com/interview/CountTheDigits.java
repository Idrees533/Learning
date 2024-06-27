package com.interview;

public class CountTheDigits {

	public static void main(String[] args) {
		
		int d=12345;
		int count=0;
		int i=1;
		while(i<=d)
		{
			d=d/10;
			++count;
		}
		System.out.println(count);
		
	}
}
