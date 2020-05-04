package Assignment1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Program12 {
	//InComplete
	/*12. accept a string and find if it is of date format "dd/mm/yyyy".
		input:01/13/2012
		output:false
	 */
	public static void main(String[] args) {
		
		String givendate = "01/13/2012";

		SimpleDateFormat dateformat = new SimpleDateFormat("dd/mm/yyyy");

		try {
			Date date = dateformat.parse(givendate);
			System.out.println("true");
		} catch (Throwable t) {
			System.out.println("false"+t.getMessage());
		}
	}
}
