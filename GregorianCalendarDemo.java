package chapter20;

import java.util.Calendar;
import java.util.*;
public class GregorianCalendarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String months[]= {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
		int year=0;
		GregorianCalendar gregorian=new GregorianCalendar();
		System.out.print("Date: ");
		System.out.print(months[gregorian.get(Calendar.MONTH)]);
		System.out.print(" "+gregorian.get(Calendar.DATE)+" ");
		System.out.println(gregorian.get(Calendar.YEAR)+" ");
		
		System.out.print("Time: ");
		System.out.print(gregorian.get(Calendar.HOUR)+":");
		System.out.print(gregorian.get(Calendar.MINUTE)+":");
		System.out.println(gregorian.get(Calendar.SECOND));
		if(gregorian.isLeapYear(year)) {
			System.out.println("The current year is a leep year");
			
		}
		else {
			System.out.println("The current year is  not a leep year");
			
		}

	}
}


