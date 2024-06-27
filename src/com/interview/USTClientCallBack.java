package com.interview;

import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

interface StateTax {
	double stateTax();
}

class Karnataka implements StateTax {

	@Override
	public double stateTax() {
		// TODO Auto-generated method stub
		return 1500;
	}
		
}

class AP implements StateTax {

	@Override
	public double stateTax() {
		// TODO Auto-generated method stub
		return 2000;
	}
	
}
public class USTClientCallBack {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		
		/*
		 * Scanner sc=new Scanner(System.in); String st=sc.next(); Class
		 * Obj=Class.forName(st);
		 * 
		 * @SuppressWarnings("unchecked") //StateTax stateObj=(StateTax)
		 * Obj.getDeclaredConstructor().newInstance();
		 */
		
		AP ob=new AP();
		
			//calling callback function by passing reference of the 
		//calling method from internal of another method
			calculateTax(ob);
				
	}

	private static void calculateTax(StateTax state) {
		// TODO Auto-generated method stub
		
		double center=2500;
		//callback
		double stateTax=state.stateTax();
		double totalTax=center + stateTax;
		
		System.out.println("The total tax ="+totalTax);
		
	}
}
