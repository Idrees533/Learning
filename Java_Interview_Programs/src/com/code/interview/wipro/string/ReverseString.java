package com.code.interview.wipro.string;

public class ReverseString {

	public static void main(String[] args) {
		String str="hello world";
		int len=str.length();
		String rev="";
		for(int i=len-1;i>=0;i--) {
		rev	=rev+ str.charAt(i);
		}
		System.out.println(rev);
		
		//StringBuffer
		StringBuffer sb=new StringBuffer(str);
		System.out.println(sb.reverse());
		
		//Stack
		
		
	}
}
