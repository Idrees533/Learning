package com.code.interview.wipro;

class Building
{
	Building()
	{
		System.out.println("Buiding");
	}
	
	Building(String name)
	{
		this();
		System.out.println("building: String Constructor " + name);
	}
	
}
public class House extends Building{

	//Extend the building class we need the Default constructor of Building class
	//otherwise compile error throw it.
	House()
	{
		System.out.println("House ");
	}
	House(String name)
	{
		this();
		System.out.println("house: String Constructor " + name);
	}
	public static void main(String[] args) {
		new House("Test");
	}
}
