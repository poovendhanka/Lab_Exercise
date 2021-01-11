
/**
	 * Create a method to accept date 
	 * and print the duration in days, months and years 
	 * with regards to current system date

	 * @author Poovendhan
	 *
	 */


package com.capg.Lab_3;
import java.time.format.DateTimeFormatter;
import java.time.*;  

public class Exercise7 {

	private static boolean printDate()
	{
		
		
		LocalDate inputDate = LocalDate.of(2020, 01, 01);
		
        LocalDate CurrentSystemDate = LocalDate.now();
        Period diff = Period.between(inputDate, CurrentSystemDate);
         System.out.printf("Duration From Given date to Current Date is \n %d days, %d months and %d years \n", 
        		 diff.getDays(), diff.getMonths(),diff.getYears() );
		
		
		return false;
	   
	}
	public static void main(String[] args) {
	    
		System.out.println("Input Date is :\n 01.01.2020");
		System.out.println("Current System Date is:");
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");  
		LocalDateTime now1 = LocalDateTime.now();  
		System.out.println(dtf.format(now1));
	     printDate();
		}
		

	}


