package Assignment1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program02 {
	// Complete
	
	/*2.Find the day(Friday) of a date input given as MM-dd-yyyy (format)
		input:12-27-2012
		output:Thursday
	 */

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws ParseException {
//		Date date =null;
		
		System.out.println("Enter the Date MM-dd-yyyy (format): ");
		
		Scanner sc=new Scanner(System.in);
		SimpleDateFormat format=new SimpleDateFormat("MM-dd-yyyy");
		String stringdate =sc.next();

		Date date=format.parse(stringdate);
		SimpleDateFormat simpleDateformat = new SimpleDateFormat("EEEE"); // the day of the week spelled out completely
        System.out.println(simpleDateformat.format(date));
		
		
		/*
		String n = "12/27/2012";
		SimpleDateFormat sdf = new SimpleDateFormat("mm/dd/yyyy");
		Date dt1 = sdf.parse(n);

		sdf = new SimpleDateFormat("EEEE");
		System.out.println(sdf.format(dt1));
*/		
	}

}
