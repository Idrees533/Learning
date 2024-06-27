package com.interview;

public class StringClass {

	public static void main(String[] args) {
		String v1="mohammed";
		v1="idrees";
		//changing the value
		
		System.out.println(v1);
		String v2="hi";
		System.out.println(v1+ " "+v2);
		String s1="hello";
		String s2="world";
		String s3=s1 + s2;
		String s4=s3;
		String s5=new String(s3);
		
		System.out.println((s3==s4));//check the reference address both s3 giving the same address
		System.out.println(s3.equals(s4));//return true because s3 assign value to s4
		System.out.println((s4==s5));//both are referencing the different address
		
		System.out.println(s3.intern());
		System.out.println(s4.intern());
		System.out.println(s5.intern());
		System.out.println(s2.intern());
		System.out.println(v1.intern());
	}
	
}
