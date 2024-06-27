package com.learn.logical;

public class PalindromeCheck {

	public static void main(String[] args) {
		String str="racecard";
	boolean isPalindrome =checkPalindrom(str);
	if(isPalindrome) {
		System.out.println(str +" is palindrome");
	} else {
		System.out.println(str +" not palindrome");
	}
				
	}

	public static boolean checkPalindrom(String str) {
		// TODO Auto-generated method stub
		int left=0;
		int right=str.length()-1;
		
		while(left<right) {
			//compare the character at initial index  and j is right index
		if(str.charAt(left)!=str.charAt(right)) {
			return false; //if the character don't match, it is not palindrome
			}
		
		//move the pointer toward the centr
		left++;
		right--;
		
		}
		return true;//if the all character match ,it's palindrome
	}
}
