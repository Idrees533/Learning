package com.learn.java.tricky;

public class BooleanTricky {

	public static void main(String[] args) {
		boolean a=true;
		boolean b=false;
		
		boolean c= a&&b || !a;
		System.out.println("Boolean c : "+c);
		
		boolean d=a||b && !a;
		
		System.out.println("Boolean d :"+d);
	}
}
