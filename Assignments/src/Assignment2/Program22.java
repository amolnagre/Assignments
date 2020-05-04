package Assignment2;

import java.util.StringTokenizer;

public class Program22 {
	/* 22. Enter yout name and return a string "print the title first and then comma and 
	 * then first letter of initial name.
	 */
		   public static String retrieveName(String s1){
	            StringTokenizer t = new StringTokenizer(s1," ");
	            String s2 = t.nextToken();
	            String s3 = t.nextToken();
	            StringBuffer sb = new StringBuffer(s2);
	            sb.append(',').append(s3.charAt(0));
	            return sb.toString();
	      }
	      public static void main(String[] args) {
	            String s1 = "Amol Nagre";
	            System.out.println(retrieveName(s1));
	      }

	}


