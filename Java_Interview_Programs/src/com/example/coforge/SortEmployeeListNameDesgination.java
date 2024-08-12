package com.example.coforge;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
	String name;
	String desgination;
	Double Salary;
	public Employee(String name, String desgination, Double salary) {
		super();
		this.name = name;
		this.desgination = desgination;
		Salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesgination() {
		return desgination;
	}
	public void setDesgination(String desgination) {
		this.desgination = desgination;
	}
	public Double getSalary() {
		return Salary;
	}
	public void setSalary(Double salary) {
		Salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", desgination=" + desgination + ", Salary=" + Salary + "]";
	}
	
	
}
public class SortEmployeeListNameDesgination {

	public static void main(String[] args) {
		
	List list	=Arrays.asList(new Employee("MIA", "IT", 50000.00),
				new Employee("IL", "Dr", 30000.00),
				new Employee("AIZ", "IT", 40000.00),
				new Employee("ZIA", "Business", 90000.00));
		//sort the salaries based on the name and desination
	
	List<Employee> sortedList= (List<Employee>) list.stream()
			.sorted(Comparator.comparing(Employee::getName)
			.thenComparing(Comparator.comparing(Employee::getDesgination)))
			.collect(Collectors.toList());
	
	System.out.println(sortedList);
	}
}
