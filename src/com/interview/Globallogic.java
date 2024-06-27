package com.interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Department {
	
	private Long deptId;
	private String deptName;
	
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department(Long deptId, String deptName) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
	}
	public Long getDeptId() {
		return deptId;
	}
	public void setDeptId(Long deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	
}

class Employee1 {
	private Long id;
	private String name;
	private Long salary;
	private Department deptment;
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", deptment=" + deptment + "]";
	}


	public Employee1(Long id, String name, Long salary, Department deptment) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.deptment = deptment;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Long getSalary() {
		return salary;
	}


	public void setSalary(Long salary) {
		this.salary = salary;
	}


	public Department getDeptment() {
		return deptment;
	}


	public void setDeptment(Department deptment) {
		this.deptment = deptment;
	}
	
	
	
}


public class Globallogic {

	public static void main(String[] args) {
		Department engineeringDept = new Department();
	        engineeringDept.setDeptId(1L);
	        engineeringDept.setDeptName("Engineering");

	        Department marketingDept = new Department();
	        marketingDept.setDeptId(2L);
	        marketingDept.setDeptName("Marketing");
		
		List<Employee1> list=new ArrayList<>();
		
		list.add(new Employee1(11L, "aaa",10000L , engineeringDept ));
		list.add(new Employee1(13L, "bb",20000L , marketingDept ));
		list.add(new Employee1(14L, "cc",30000L , marketingDept ));
		list.add(new Employee1(15L, "dd",15000L , engineeringDept ));
		//Intitialize the map store the highest salary	
	
		 Map<Department, Long> highestSalaries = new HashMap<>();

		 //from the list we get the deptment and salary
	        for (Employee1 employee : list) {
	            Department department = employee.getDeptment();
	            Long salary = employee.getSalary();

	            // Update the highest salary for the department
	            highestSalaries.put(department, Math.max(highestSalaries.getOrDefault(department, 0L), salary));
	        }
	        for (Map.Entry<Department, Long> entry : highestSalaries.entrySet()) {
	            System.out.println("Department: " + entry.getKey().getDeptName() + ", Highest Salary: " + entry.getValue());
	        }
        
			
	}
}
