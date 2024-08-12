package com.code.interview.wipro;

import java.util.ArrayList;
import java.util.List;

public class Generics {

	public static void main(String[] args) {
		
		List<Object> list=new ArrayList();
		list.add(1);
		list.add(14.5f);
		list.add(10000L);
		list.add("hi");
		
		System.out.println(list);
		
	}
}
