package com.learn.java8.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class User implements Comparable<User> {
		public String name;
		public int age;
		
		
	public User(String name, int age) {
			super();
			this.name = name;
			this.age = age;
		}


	public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public int getAge() {
			return age;
		}


		public void setAge(int age) {
			this.age = age;
		}


		@Override
		public int compareTo(User o) {
			// TODO Auto-generated method stub
			return name.compareTo(o.name);
		}


		@Override
		public String toString() {
			return "User [name=" + name + ", age=" + age + "]";
		}


	
	
}

public class NullFirstSort {

	public static void main(String[] args) {
		
		User user=new User("C", 2);
		User user2=new User("B",3);
		User user3=new User("A",5);
		
	List<User>list	= Arrays.asList(user,user2,user3,null,null);
	//noted , collections.sort
	Collections.sort(list, 
			Comparator.nullsFirst(Comparator.comparing(User::getName)));
	
	list.forEach(p ->System.out.println(p));
	
	
	Collections.sort(list, 
			Comparator.nullsLast(Comparator.comparing(User::getName)));
	
	list.forEach(p ->System.out.println(p));
	
	
		
		
		
		
	}
}
