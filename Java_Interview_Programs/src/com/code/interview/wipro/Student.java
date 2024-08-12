package com.code.interview.wipro;

import java.util.List;

public class Student {

	int doj;
	String name;
	List<Integer> marks;
	
	public Student(int doj, String name, List<Integer> marks) {
		super();
		this.doj = doj;
		this.name = name;
		this.marks = marks;
	}
	public int getDoj() {
		return doj;
	}
	public void setDoj(int doj) {
		this.doj = doj;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Integer> getMarks() {
		return marks;
	}
	public void setMarks(List<Integer> marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [doj=" + doj + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
}
