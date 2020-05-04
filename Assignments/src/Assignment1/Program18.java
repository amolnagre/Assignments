package Assignment1;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Program18 {

	/*18.  Check whether a given string is palindrome also check 
	 * whether it has atleast 2 different vowels
		input: "madam"
		output: false(no 2 diff vowels)
	 */
	//private static final String LinkHashSet hs = null;

	public static void main(String[] args) {
		
		String str;

		Scanner sc = new Scanner(System.in);
	    System.out.print("Enter the string you want to check:");
	    str = sc.nextLine();
		
		StringBuffer sb = new StringBuffer(str);// 
		sb.reverse();// reverse is method to reverse the given String 
		String s1=sb.toString();// To String Convert value in String s1.
		boolean count=true;
		if(s1.equals(str))// equals is used to checking the contents into the string not use == for comparison
		{
			System.out.println("Given String is Palindrome...");
		}else
		{
			System.out.println("Given String is Not Palindrome...");
		}
		
		LinkedHashSet<Character> hs=new LinkedHashSet<Character>();
		for(int i=0 ; i<s1.length();i++)
		{
		
		
		if(s1.charAt(i)=='a' || s1.charAt(i)=='A' || s1.charAt(i)=='e' || s1.charAt(i)=='E' || s1.charAt(i)=='i' || s1.charAt(i)=='I' || s1.charAt(i)=='o' || s1.charAt(i)=='O' || s1.charAt(i)=='u' || s1.charAt(i)=='U')
			
		{
			hs.add(s1.charAt(i));
		}
		
		}
		System.out.println("Vowels are: "+hs.size());
	}
}

		 /*	String a, b = "";
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the string you want to check:");
	        a = sc.nextLine();
	        int n = a.length();
	        for(int i = n - 1; i >= 0; i--)
	        {
	            b = b + a.charAt(i);
	        }
	        if(a.equalsIgnoreCase(b))
	        {
	            System.out.println("The string is palindrome.");
	        }
	        else
	        {
	            System.out.println("The string is not palindrome.");
	        }*/

	


