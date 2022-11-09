package Set2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Todays_Date_Time {

	public static void main(String[] args) {
		//Write a program to print todays date and time

		Date date=new Date();
		Calendar cal=Calendar.getInstance();
		cal.setTime(date);
		
		System.out.println(cal.getTime());
//		
//		  DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
//		   LocalDateTime now = LocalDateTime.now();  
//		   System.out.println(dtf.format(now)); 
		   
		   DateTimeFormatter dt=DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
		   LocalDateTime local=LocalDateTime.now();
		    System.out.println(dt.format(local));;

	}

}
