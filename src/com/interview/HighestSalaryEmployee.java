package com.interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class Employee {
	private int empid;
	private String empName;
	private Long salary;
	
	public Employee(int empid, String empName, Long salary) {
		super();
		this.empid = empid;
		this.empName = empName;
		this.salary = salary;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Long getSalary() {
		return salary;
	}
	public void setSalary(Long salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empName=" + empName + ", salary=" + salary + "]";
	}
	
	
	
	
}

public class HighestSalaryEmployee {

	public static void main(String[] args) {
		
		List<Employee> empList=Arrays.asList(new Employee(1, "MIA", 50000L),
				new Employee(2, "MIZ", 60000L),
				new Employee(2, "MIAZ", 80000L),
				new Employee(2, "MIIZ", 70000L));
				
		List highSalary	=	empList.stream().sorted(Comparator.comparingLong(Employee::getSalary).reversed())
				.collect(Collectors.toList());
		Employee	emp=	empList.stream().collect(Collectors.maxBy(Comparator
								.comparingLong(Employee::getSalary))).get();
					
		System.out.println("highest sal"+emp.getSalary());

		
		System.out.println("Highest Salary "+highSalary);
		
	}
}
