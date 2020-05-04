package Assignment1;

import java.util.Scanner;

public class Program05 {

	public static void main(String[] args) {
		// Complete
		
		/*5. Sum of fibonaaci series upto given input.
		sum of first 3 
		logic:1+1+2
		output:4

		 * 
		 */

		int a = 1;
		int b = 1;
		int c = 0;
		int num = 3 ;
		int sum = 0;
		
	/*	Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		num=sc.nextInt();*/
		

		for (int i = 1; i < num; i++) {
			c = a + b;
			sum=sum+c;
			a = b;
			c = b;

		}
		System.out.println(sum);
	}
	}


