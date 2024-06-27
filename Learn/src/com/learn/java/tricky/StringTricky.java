package com.learn.java.tricky;

public class StringTricky {

	public static void main(String[] args) {
		
		String s1="Java";
		String s2="Ja" + "va";
		
		//System.out.println((s1==s2));
		//System.out.println((s1.equals(s2)));
		
//		System.out.println("Hello"==new String ("Hello"));
		
		String abc="abc";
		String xyz=new String("abc");
		
		System.out.println(abc.equals(xyz) && abc==xyz);
		
		String a="apple";
		String b="apple";
		a=a.replace("p","b");
		System.out.println(a+b);
		
		System.out.println("string intern() ----");
	
		String s3=new String("hello");
		String s4= "hello";
		//return the value of string 
		System.out.println(s3.intern()==s4);
		
	}
}
