package com.prosmart.actionitems.jan16;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.Month;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalenderN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		performCalendar(1);
		performCalendar(2);
		   
		      // CalenderN calc = new CalenderN();
		     //  calc.performCalendar();//performs the function located in said method
		   }
		   
		   public static void performCalendar(int month) {
		      //Set calendar to 6th March 2009
			   
			   Calendar calc = new GregorianCalendar(2009, month, 1);
			   int maxDay = calc.getActualMaximum(Calendar.DAY_OF_MONTH);
		     for(int x=1; x<=maxDay; x++)
		    	 //goes through the days
		     {
		    	 
		    	 //uses the function gregorian function for the calender
		    		 
		    		 //set m for month integer and x for the day integer
		    		 calc.set(Calendar.MONTH, month);//adds the month going through the loop statement intiated at the top
		    		 calc.set(Calendar.DAY_OF_MONTH, x);
		    		 
		    		 //Define Format of date
		    		 SimpleDateFormat sdf = new SimpleDateFormat("d MMM yyyy");
		    		 String date = sdf.format(calc.getTime());
		    		 System.out.println(date);
		      
		    		
		    	 
		
		     }

		}
		   
}