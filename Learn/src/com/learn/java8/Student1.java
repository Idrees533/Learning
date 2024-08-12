package com.learn.java8;

public class Student1 {

	private int id;
	private String name;
	private int standard;
	private String grade;
	
	
	public Student1(int id, String name, int standard, String grade) {
		super();
		this.id = id;
		this.name = name;
		this.standard = standard;
		this.grade = grade;
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
	public int getStandard() {
		return standard;
	}
	public void setStandard(int standard) {
		this.standard = standard;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Student1 [id=" + id + ", name=" + name + ", standard=" + standard + ", grade=" + grade + "]";
	}
	
	
	
}
