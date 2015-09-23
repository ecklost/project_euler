package newProjectEuler;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class euler19 {
	// Project Euler #19: Find how many Sundays are the first of the month between Jan. 1, 1901 to Dec. 31, 2000.
	
	public static void main(String[] args) {
		int firstSundays = 0;
		GregorianCalendar gc = new GregorianCalendar(1901, 0, 1);
		while (gc.get(gc.YEAR) < 2001) {
			if (gc.get(gc.DAY_OF_WEEK) == gc.SUNDAY && gc.get(gc.DAY_OF_MONTH) == 1) {
				firstSundays++;
			}
			gc.add(gc.DAY_OF_YEAR, 1);
		}
		System.out.println("First Sundays: " + firstSundays);
	}
}