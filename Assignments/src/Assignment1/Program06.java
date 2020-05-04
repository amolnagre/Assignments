package Assignment1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program06 {

	public static void main(String[] args) throws ParseException {
		//Complete
		
		/*6. Given date in dd-MM-yyyy format.
		 *   return the month in full name format(January)
			 input:"23-01-2012"
			 output:January
		 * 
		 */
		
		//String userdate = "23-01-2012";
		String userdate;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter date in dd-MM-yyyy: ");
		userdate=sc.next();
		SimpleDateFormat dateformat = new SimpleDateFormat("dd-MM-yyyy");
		Date dt1 = dateformat.parse(userdate);

		dateformat = new SimpleDateFormat("MMMM");
		System.out.println(dateformat.format(dt1));
		

	}

}
