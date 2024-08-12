package com.code.interview.wipro;

import java.util.List;

public class Employee1 {
	private int id;
	private String name;
	private String gender;
	private int yoj;
	private List<Double> salary;
	
	public Employee1(int id, String name, String gender, int yoj, List<Double> salary) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.yoj = yoj;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getYoj() {
		return yoj;
	}

	public void setYoj(int yoj) {
		this.yoj = yoj;
	}

	public List<Double> getSalary() {
		return salary;
	}

	public void setSalary(List<Double> salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", name=" + name + ", gender=" + gender + ", yoj=" + yoj + ", salary=" + salary
				+ "]";
	}
	
	
	
	

}
