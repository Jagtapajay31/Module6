package com.assignment;
/*
 * WAP to concatenate a given string to the end of another string.
 */
public class EndOfAnotherString {
	public static void main(String[] args) {
		        String str1 = "i am ";
		        String str2 = "Ajay";
		        
		        System.out.println("String 1: " + str1);
		        System.out.println("String 2: " + str2); 
		       
		        String str3 = str1.concat(str2);

		        System.out.println("The concatenated string: " + str3);
		    }
	}