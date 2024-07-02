package com.assignment;
/*
 *  WAP to Compare Two String.
 */
public class CompareTwoString {
	public static void main(String[] args) {
		
		String  s1="This is Student";
		
		if (s1.equalsIgnoreCase("this is Student")) {
			System.out.println("both string are same");
		} else {
			System.out.println("both string are diff");
		}
		
		if (s1.equals("this is Student")) {
			System.out.println("both string are same");
		} else {
			System.out.println("both string are diff");
		}
	
	}
}
