package com.assignment;

import java.util.ArrayList;
import java.util.Iterator;

/*
 *  WAP to iterate through all elements in an array list.
 */
public class IterateArrayList {
	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		
		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(4);
		a1.add(5);
		
		System.out.println("Defualt value is :"+a1);
		System.out.println("Default size is :"+a1.size());
		
		Iterator i1=a1.iterator();
		
		while (i1.hasNext()) {
			System.out.println(i1.next());
		}
	}
}