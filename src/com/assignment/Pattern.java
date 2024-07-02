package com.assignment;

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
		for (int i1 = 1; i1 <= 5; i1++) {
			for (int j1 = 1; j1 <= i1; j1++){
				if ((i1 + j1) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                    }
				}
			System.out.println();
			}

/*
 * 3)
 * 		1
	   2 2
	  3 3 3
	 4 4 4 4
 */
		for (int i = 1; i <= 4; i++){
			for (int k = i; k <= 4; k++) {
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
 */     
		for (int i = 1; i <= 3; i++) {
			for (int k = i; k <= 3; k++) {
				System.out.print(" ");
			}
				for (int j = 1; j <= i*2-1; j++){
					System.out.print("*");
				}
				System.out.println();
			}
		for (int i = 2; i >= 1; i--) {
			for (int k = i; k <= 3; k++) {
				System.out.print(" ");
			}
				for (int j = i*2-1; j >= 1; j--){
					System.out.print("*");
				}
				System.out.println();
			}
	}
}