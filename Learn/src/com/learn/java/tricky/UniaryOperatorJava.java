package com.learn.java.tricky;

public class UniaryOperatorJava {

	public static void main(String[] args) {
		
		int x=40;
		int y= x < 20 ? 1: 2;
		
		//System.out.println(y);
		
		int z=(x > 50) ? (x < 40 ? 1 : 2):3; 
		
		System.out.println(z);
	}
}
