package com.interview;

interface taxCalculation{
	double calucalateTax();
}

abstract class AbstractcalculateTax implements taxCalculation {
	double rate;
	//we can create the constructor inside a abstract class
	public AbstractcalculateTax(double rate) {
		this.rate=rate;
	}
	abstract double calucalateTax(double rate);
}

class SalesCalculateTax extends AbstractcalculateTax {

	public SalesCalculateTax(double rate) {
		super(rate);
		// TODO Auto-generated constructor stub
	}

	//compiler error is if we are not define the constructor of extends class (parent class) have
	//
	
	
	@Override
	double calucalateTax(double amount) {
		// TODO Auto-generated method stub
		return amount * this.rate;
	}

	@Override
	public double calucalateTax() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
public class NisumTechnology {
public static void main(String[] args) {
	SalesCalculateTax sobj=new SalesCalculateTax(0.5);
	System.out.println(sobj.calucalateTax(0.5));
}
	
}
