package Assignment1;

import java.util.Scanner;

public class Program14 {
	/*14.  Find the extension of a given string file.
		input: "hello.jpeg"
		output: "jpeg"
	 */

	public static void main(String[] args) {
		
		String f;
		String extesion;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The FIle Name with Extension : ");
		f=sc.next();
		int index;
		index = f.indexOf(".");
		
		extesion = f.substring(index+1);
		
		System.out.println("OutPut :"+extesion);
		
		

	}

}
