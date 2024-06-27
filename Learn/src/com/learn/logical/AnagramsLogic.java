package com.learn.logical;

import java.util.Arrays;

public class AnagramsLogic {

	public static void main(String[] args) {
		 String str1 = "listen";
	        String str2 = "silent";
	    boolean areAnagram  =areAnagram(str1,str2);
	    System.out.println("Are anagram "+areAnagram);
	}

	private static boolean areAnagram(String str1, String str2) {
		// TODO Auto-generated method stub
		//converting string to character array form
	char[] charArray1=str1.toCharArray();
	char[] charArray2=	str2.toCharArray();
	//sort the both character arrays
	Arrays.sort(charArray1);
	Arrays.sort(charArray2);
	
	return Arrays.equals(charArray1, charArray2);
	}
}
