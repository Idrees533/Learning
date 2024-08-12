package com.example.caspux;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
	private int empId;
	private String name;
	private double salary;
	public Employee(int empId, String name, double salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
}
public class EmployeeNameSalary {

	
	public static void main(String[] args) {
  List<Employee>emplist	=Arrays.asList(new Employee(101, "MIA", 10000),
				new Employee(102,"ZIA",23000),
				new Employee(104,"AIA",22000),
				new Employee(103,"ZI",15000));
  
  	List<String> names	=emplist.stream().filter(p->p.getSalary() < 20000)
  			.peek(e->e.setSalary(e.getSalary()* 1.1))
  		.map(Employee::getName).collect(Collectors.toList());
  	
  	System.out.println("names :"+names);
  	
		
		
	}
}
