package com.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListSample {

	public static void main(String[] args) {
		List<String> list= new ArrayList<String>();
		list.add("Sumit");
		list.add("Vilas");
		list.add("Vandana");
		list.add("Karan");
		
		Iterator itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
