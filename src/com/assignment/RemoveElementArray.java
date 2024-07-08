package com.assignment;

import java.util.ArrayList;
import java.util.List;

/*
 * WAP to remove the third element from a array list.
 */
public class RemoveElementArray {
	public static void main(String[] args) {
		ArrayList r1=new ArrayList();
		
		r1.add(1);
		r1.add(2);
		r1.add(3);
		r1.add(4);
		r1.add(5);
		
		System.out.println("Defualt value is :"+r1);
		System.out.println("Default size is :"+r1.size());
		
		r1.remove(2);
		
		System.out.println("new value is :"+r1);
		System.out.println("new size is :"+r1.size());
	}
}