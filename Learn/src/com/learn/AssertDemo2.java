package com.learn;

public class AssertDemo2 {

	public static void main(String[] args) {
		
		int age=20;
		assert age<=19:"can not vote";
		System.out.println("voter age :"+age);
	}
}
