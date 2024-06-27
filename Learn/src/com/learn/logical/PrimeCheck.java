package com.learn.logical;

public class PrimeCheck {

	public static void main(String[] args) {
		int number=17;
		boolean prime=	isPrime(number);
		if(prime) {
			System.out.println(prime +" is prime number");
		} 
		else {
			System.out.println(prime + "is not prime number");
		}
			
	}

	private static boolean isPrime(int number) {
		// TODO Auto-generated method stub
		if(number < 1)  {
			return false;
		}
		for(int i=2;i<Math.sqrt(number);i++) {
			if(number%i==0) {
				return false;
			}
		}
		return true;
		
	}
}
