package com.quz;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Calender {
	public static void main(String[] args) {

		String year1 = "2019";
		String months[] = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		String days[] = { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };
		int noofdays[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		int year = Integer.parseInt(year1);
		if (leap(year)) {
			noofdays[1] = 29;
		}
		System.out.println();
		int dow = 0;
		for (int i = 0; i < 12; i++) {
			System.out.println(String.format("%15s", "") + months[i] + "  " + year);
			System.out.println();
			for (int j = 0; j < 7; j++)
				System.out.print(String.format("%3s", "") + days[j]);
			System.out.println(" ");
			dow = dow(1, i + 1, year);
			for (int k = 1; k <= dow; k++)
				System.out.print(String.format("%6s", ""));
			for (int l = 0; l < noofdays[i]; l++) {
				System.out.print(String.format("%" + (4 + 2 - String.valueOf(l + 1).length()) + "s", "") + (l + 1));
				if ((l + dow + 1) % 7 == 0)
					System.out.println();
			}
			System.out.println();
			System.out.println(" ");
		}
	}

	// for calculation of day of week
	private static int dow(int dd, int mm, int yyyy) {
		Calendar GC = new GregorianCalendar();
		GC.set(yyyy, mm - 1, dd, 12, 0, 0);
		int DOW = GC.get(Calendar.DAY_OF_WEEK); // 6=Friday
		return DOW - 1;
	}

	// Function to chek the year is leap or not.
	private static boolean leap(int yyyy) {
		return (yyyy % 4 == 0 && yyyy % 100 != 0) || (yyyy % 400 == 0);
	}
}