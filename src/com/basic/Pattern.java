package com.basic;

/*
 *  W.A.J.P to Print pattern Given Below.
 * 1)
1
12
123
1234
12345
 */
public class Pattern{

	public static void main(String[] args)
	{
		int number;
		number = 5;
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println(" ");
		}
		System.out.println("");
/* 2)
 *  1
	01
	101
	01010
	101010
*/
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++){
				System.out.print(j%2);
			}
			System.out.println(" ");
		}
		System.out.println("");
/*
 * 3)
 * 		1
	   2 2
	  3 3 3
	 4 4 4 4
 */
		for (int i = 1; i <= 5; i++){
			for (int k = i; k <= 5; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(" "+i);
			}
			System.out.println();
		}
		System.out.println(" ");
		
/*
 * 			*
 		  * * *
 		* * * * *
 		  * * *
 		    *
// */
//		int size = 3;
//        for (int i = 0; i < size * 2 - 1; i++) {
//            int spaces = Math.abs(size - 1 - i);
//            int stars = size - spaces;
//            
//            for (int j = 0; j < spaces * 2; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j < stars * 2 - 1; j++) {
//                System.out.print("* ");
//            }
//            System.out.println("");
//        }
		for (int i = 1; i <= 2*2-1; i++) {
			for (int k = i; k <= 3*2-1; k++) {
				System.out.print(" 	");
			}
				for (int j = 1; j <= i; j++){
					System.out.print("* ");
				}
				System.out.println();
			}
	}
}
