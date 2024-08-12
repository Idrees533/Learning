package com.learn.java8;

public class SalaryCalculationException extends Exception{

}

class Person {
	public void calculateSalary() throws SalaryCalculationException {
		throw new SalaryCalculationException();
	}
}

//Compiler exception 
//
class Company {
	public void paySalaries() {
		new Person().calculateSalary();
	}
}
