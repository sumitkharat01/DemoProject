package com.demo;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSample {

	public static void main(String[] args) {
		List<String> list= new ArrayList<String>();
		list.add("Sumit");
		list.add("Vilas");
		list.add("Vandana");
		list.add("Karan");
		
		for(String s:list) {
			System.out.println(s);
		}
	}
}
