package com.interview;

public class AssertClass {

	public static void main(String[] args) {
		
		String s="Hi";
		assert s!=null:" s is null";
		// can not invoke string object because string is null
		//if we trying to invoke a method with null value throw the exception is nullpointerException
		System.out.println(s.length());
	}
}
