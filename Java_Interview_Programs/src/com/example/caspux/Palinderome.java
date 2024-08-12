package com.example.caspux;

public class Palinderome {

	public static void main(String[] args) {
		String s="radar";
			
		StringBuilder reverse=new StringBuilder();
					
		for(int i=s.length()-1;i>=0;i--) {
			 
			reverse.append(s.charAt(i));
		}
		if(s.equals(reverse.toString())) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palinderome");
		}
		      
	}
}
