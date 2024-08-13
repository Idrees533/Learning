package com.code.interview.wipro;

public class SpecificCharacter {

	public static void main(String[] args) {
		
		String str="hello world";
		
		char targetCharacter='e';
		
	if(	str.chars().anyMatch(p->p ==targetCharacter)) {
		System.out.println("character ' "+targetCharacter+" ' found");
		
	}
	else {
		System.out.println("character ' "+targetCharacter+" ' NOT found");
	}
		
	}
}
