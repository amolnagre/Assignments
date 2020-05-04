package Assignment1;

import java.util.Scanner;

public class Program10 {
	// Complete
	
	/*10. Get a input string. reverse it and parse it with '-'.
		input:computer
		output:r-e-t-u-p-m-o-c
	 */
	
	
public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.println("enter string");
	String str= sc.next();
	
	String ans="";
	
	for (int i=str.length()-1;i>=0;i-- ) {
		char c=str.charAt(i);// charAt is used for return value of index
		ans=ans+c+"-";
	}
	System.out.println(ans.substring(0,ans.length()-1));
	
	}
}
