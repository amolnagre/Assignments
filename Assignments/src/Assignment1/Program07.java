package Assignment1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Program07 {
	public static void main(String[] args) {
		// incomplete(don't know the conounit.Months.Between)
		/*7. Two dates are given as input in "yyyy-MM-dd" format. Find the number of months between the two dates
		input1:"2012-12-01"
		input2:"2012-01-03"
		output:11*/
		
		
		
		
		String n = "2012-12-01";			
		String j = "2012-01-03";
		
		
		LocalDate d = LocalDate.of(2013,10,01);
		LocalDate x = LocalDate.of(2012,01,01);
				
		
	//ChronoUnit.MONTHS.between(x,d));	
		//System.out.println(ChronoUnit.MONTHS.between(x,d));
	}

}
