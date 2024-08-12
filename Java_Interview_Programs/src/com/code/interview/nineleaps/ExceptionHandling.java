package com.code.interview.nineleaps;

import java.io.FileNotFoundException;

class Parent {
	
	//Parent throw Runtime exception and child throgh the exception is doesn't allowed
	//parent throw NullPointerException and Child throw the RUnTImeException is allowd
	
	public void m1() throws Exception {
		System.out.println("Parent exception");
	}
}
class Child extends Parent {
	//If Parent through the Exception and child through the RUnTImeException is allowed
	//If Parent throgh the Excepton and child throw the FIleNotFOudExeption is allowdd
	//If Parent Through the RuntimeException and child Through FileNotFOundException is not allowed
	@Override
	public void m1() throws FileNotFoundException {
		System.out.println("Child Exception");
	}
}
public class ExceptionHandling {

}
