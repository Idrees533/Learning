package com.code.interview.wipro;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

class Employee {
	int eid;
	String ename;
	String department;
	long salary;
	
	public Employee(int eid, String ename, String department, long salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.department = department;
		this.salary = salary;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", department=" + department + ", salary=" + salary + "]";
	}
	
	
}
public class Wipro_Collectionframwork {

	public static void main(String[] args) {
		
		List<Employee> empList=Arrays.asList(new Employee(101, "MIA", "IT", 50000),
				new Employee(102, "MII", "Doctor", 60000),
				new Employee(104, "MIY", "Teacher", 40000),
				new Employee(105, "MAA", "IT", 70000),
				new Employee(106, "MIYZ", "Doctor", 50000),
				new Employee(107, "MIYA", "Teacher", 60000),
				new Employee(108, "MA", "IT", 40000));
		//get the highest salary of employee
		
	Optional<Employee> highestSalary=Optional.ofNullable(empList.stream()
			.collect(Collectors.maxBy(Comparator.comparingLong(Employee::getSalary)))
		.get());
	
				if(highestSalary.isPresent()) {
					System.out.println("Highest Salry "+highestSalary.get());
				} else {
					System.out.println("Not available");
				}
				
	//get the highest salary of each department
				
				Map<String, Optional<Employee>> emp	=empList.stream().collect(Collectors
						.groupingBy(Employee::getDepartment,
						Collectors.maxBy(Comparator.comparingLong(Employee::getSalary))));
			
				emp.forEach((dept,employee)-> {
						Long highest	=	employee.map(Employee::getSalary).orElse(0L);
			System.out.println("department "+dept+", highest salary "+highest);
			
			});
				
				
				
				
				
				
				
				
				
				
	}
}
