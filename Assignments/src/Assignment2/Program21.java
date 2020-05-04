package Assignment2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Program21 {

	public static void main(String[] args) {
		
		/*Find the number of days between two input dates.
		 */

		
		SimpleDateFormat myFormat = new SimpleDateFormat("dd MM yyyy");
		
		String inputString1 = "23 01 1997";// given input
		
		String inputString2 = "27 04 1997";// given input

		try {
		    Date date1 = myFormat.parse(inputString1);// convert string to date
		    Date date2 = myFormat.parse(inputString2);// convert string to date
		    long diff = date2.getTime() - date1.getTime();// calculate date 
		    System.out.println ("Days: " + TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS));// print output
		    
		    /*float daysBetween = (difference / (1000*60*60*24));
            * You can also convert the milliseconds to days using this method
             * float daysBetween = 
             *         TimeUnit.DAYS.convert(difference, TimeUnit.MILLISECONDS)
             */
		} catch (ParseException e) {
		    e.printStackTrace();// print exceptions
		}
		
		
	}

}
