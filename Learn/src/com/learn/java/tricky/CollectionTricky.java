package com.learn.java.tricky;

import java.util.ArrayList;
import java.util.List;

public class CollectionTricky {

	public static void main(String[] args) {
		
		List list=new ArrayList();
		
		list.add("A");
		list.add("B");
		list.set(1, "C");
		list.add("D");
		System.out.println(list);
	}
}
