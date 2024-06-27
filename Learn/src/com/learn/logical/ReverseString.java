package com.learn.logical;

public class ReverseString {

	public static void main(String[] args) {
		String str="Hello world";
		StringBuilder s=new StringBuilder(str);
		System.out.println(s.reverse());
		
		String revese=reversed(str);
		System.out.println("reverse string "+revese);
	}

	private static String reversed(String str) {
		// TODO Auto-generated method stub
		
			char[] ch=str.toCharArray();
			
			int i=0;
			int j=ch.length-1;
			while(i<j) {
				char temp=ch[i];
				ch[i]=ch[j];
				ch[j]=temp;
				i++;
				j--;
				
			}
			
		return new String (ch);
	}
}
