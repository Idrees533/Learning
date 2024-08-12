package com.learn.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class Demo {

	public static void main(String[] args) {
		List<Integer> list =  Arrays.asList(1,2,3,4,5,6,8);
		//{2,4,6,8}  =4+8+12+16
	//	Predicate<Integer> p= new Predicate <Integer> () {
		
	//public boolean test(Integer n) { return false;}
				// TODO Auto-generated method stub
			
			
		
	/*
	 * Function<Integer, Integer> f=new Function<Integer, Integer>() {
	 * 
	 * @Override public Integer apply(Integer n) { // TODO Auto-generated method
	 * stub return n*2; }
	 * 
	 * };
	 */
	/*
	 * BinaryOperator<Integer> b=new BinaryOperator<Integer>() {
	 * 
	 * @Override public Integer apply(Integer t, Integer u) { // TODO Auto-generated
	 * method stub return null; } };
	 */	// TODO Auto-generated method stub
		

		//get the even number then mulitply by 2 and summ of the number:
int result =  list.stream().filter(n -> n%2==0).map(n -> n*2).reduce(0,(t, u) -> t+u);
		  
		  System.out.println(result);
	}
}
