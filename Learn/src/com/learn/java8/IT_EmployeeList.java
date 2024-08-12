package com.learn.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
	private int empid;
	private String empName;
	private String department;
	private Long salary;
	
	public Employee(int empid, String empName, String department, Long salary) {
		super();
		this.empid = empid;
		this.empName = empName;
		this.department = department;
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

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Long getSalary() {
		return salary;
	}

	public void setSalary(Long salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empName=" + empName + ", department=" + department + ", salary=" + salary
				+ "]";
	}
	
	
	
}
public class IT_EmployeeList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee> empList=Arrays.asList(new Employee(101, "MIA", "IT", 50000L),
				new Employee(103, "MIA", "IT", 50000L),
				new Employee(102, "MIF", "IT", 40000L),
				new Employee(108, "MIZ", "TO", 90000L),
				new Employee(104, "MIW", "BPO", 80000L),
				new Employee(105, "MIR", "DC", 50000L));
		
		//get the employees from department is "IT"
	List itList=empList.stream().filter(p->p.getDepartment().equals("IT")).collect(Collectors.toList());
			System.out.println(itList);
	
	}

}
