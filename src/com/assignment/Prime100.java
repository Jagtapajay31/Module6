package com.assignment;
/*
 * WAP to compute the sum of the first 100 prime numbers
 */
public class Prime100 {
	public static void main(String[] args) {
		int i, number = 0 , count, sum = 0;
				
				while(number <= 100)
				{
					count = 0;
					i = 2;
				    while(i <= number/2 )
				    {
				    	if(number % i == 0)
				    	{
				    		count++;
				    		break;
				    		
				    	}
				    	i++;

				    }
				    if(count == 0 && number != 1 )
				    {
				    	sum = sum + number;
				    }
				    number++;
				}
		                System.out.println("\n The Sum of Prime Numbers from 1 to 100 = " + sum);
			}
	}