package com.code.interview.publicisapient;
//product interface

interface Animal {
	void sound();
}

//concrete product class
class Dog implements Animal {

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("Wooof");
	}
	
}

//Factory Interface  
interface AnimalFactory {
	Animal createFactory();
}

//concrete factory classes 
class DogFactory implements AnimalFactory {

	@Override
	public Animal createFactory() {
		// TODO Auto-generated method stub
		return new Dog();
	}
	
}
public class FactoryDesignPattern {

	public static void main(String[] args) {
		AnimalFactory object=new DogFactory();
		Animal animalobj=object.createFactory();
		animalobj.sound();
	}
}
