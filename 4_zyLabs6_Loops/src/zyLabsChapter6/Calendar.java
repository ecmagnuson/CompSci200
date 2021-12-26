package zyLabsChapter6;
//Commented out package so it will compile on zyLabs

import java.util.Scanner;

///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
//Title:          Refactoring the calendar.java program from zyLabs Chapter 6. Creating a calandar from user input of year, month, day.
//Course:         CS200 F21
//
//Author:          Elliott Magnuson
//Email:           ecmagnuson@wisc.edu
//Lecturer's Name: Jim Williams
//
///////////////////////////////// CITATIONS ////////////////////////////////////
//
//None were used.
//
//
/////////////////////////////// 80 COLUMNS WIDE ////////////////////////////////

/**
 * This class contains the entire program to print out a calendar and find the
 * day of a week for a given month/date/year.
 *
 * @author Jim Williams
 * @author Devesh Shah
 * @author Elliott Magnuson
 */
public class Calendar {

	/**
	 * This method exists to center align the calendar title as well as print out "----" 
	 * symbols as a part of the calendar header. 
	 * 
	 * @param headerObject The object needed to print in the calendar title. 
	 * @param distanceNeeded The amount of characters that need to be printed.
	 */
	public static void formatCalendarHeading(char headerObject, int distanceNeeded) {

		for (int i = 0; i < distanceNeeded; i++) {
			System.out.print(headerObject);
		}
	}

	/**
	 * This returns whether the specified year is a leap year.
	 *
	 * The algorithm is: Every year that is exactly divisible by four is a leap
	 * year, except for years that are exactly divisible by 100, but these centurial
	 * years are leap years if they are exactly divisible by 400. For example, the
	 * years 1700, 1800, and 1900 are not leap years, but the years 1600 and 2000
	 * are. https://en.wikipedia.org/wiki/Leap_year
	 *
	 * @param year The year to determine whether it is a leap year.
	 * @return true if the year is a leap year, false otherwise.
	 */
	public static boolean isLeapYear(int year) {
		boolean isLeapYear = false;
		
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					isLeapYear = true;
				} else {
					isLeapYear = false;
				}
			} else {
				isLeapYear = true;
			}
		} else {
			isLeapYear = false;
		}
		return isLeapYear;
	}

	/**
	 * This returns the number of days in the specified month of year.
	 *
	 * @param month The month to return the number of days.
	 * @param year  The year is used for determining whether it is a leap year.
	 * @return The number of days in the specified month of the year.
	 */
	public static int getDaysInMonth(int month, int year) {
		int daysInMonth = 0;
		switch (month) {
		// 31 days
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			daysInMonth = 31;
			break;

		// 30 days
		case 4:
		case 6:
		case 9:
		case 11:
			daysInMonth = 30;
			break;

		case 2: // 28 or 29 days
			if (isLeapYear(year)) {
				daysInMonth = 29;
			} else {
				daysInMonth = 28;
			}
			break;
		}
		return daysInMonth;
	}

	/**
	 * Returns the name of the month, given the number of the month.
	 *
	 * @param month The month where 1 is January and 12 is December.
	 * @return The name of the month.
	 */
	public static String getMonthName(int month) {
		String monthStr;
		switch (month) {
		case 1:
			monthStr = "January";
			break;
		case 2:
			monthStr = "February";
			break;
		case 3:
			monthStr = "March";
			break;
		case 4:
			monthStr = "April";
			break;
		case 5:
			monthStr = "May";
			break;
		case 6:
			monthStr = "June";
			break;
		case 7:
			monthStr = "July";
			break;
		case 8:
			monthStr = "August";
			break;
		case 9:
			monthStr = "September";
			break;
		case 10:
			monthStr = "October";
			break;
		case 11:
			monthStr = "November";
			break;
		case 12:
			monthStr = "December";
			break;
		default:
			monthStr = "unknown";
			break;
		}
		return monthStr;
	}

	/**
	 * This method prints the calendar title, heading character, and days of the week into 
	 * the terminal formatted like a real calendar.  
	 * 
	 * @param monthName The name of the Month you want to print
	 * @param year The year you want your calendar to be.
	 */
	public static void printCalendarHeading(String monthName, int year) {
		final int TOTAL_WIDTH = 28;
		final char MONTH_HEADER_LINE_CHAR = '-';

		System.out.println();
		String calendarTitle = monthName + " " + year;
		
		int spacesBefore = (TOTAL_WIDTH - calendarTitle.length()) / 2;
		formatCalendarHeading(' ', spacesBefore);
		
		System.out.println(calendarTitle);
		
		formatCalendarHeading(MONTH_HEADER_LINE_CHAR, TOTAL_WIDTH);
		
		System.out.println();
		System.out.println("Sun Mon Tue Wed Thu Fri Sat");
	}

	/**
	 * This prints out the days of the month in the correct day of the week column.
	 *
	 * @param startDay    The day of the week of the 1st day of the month, where 0
	 *                    is Sunday, 1 is Monday.
	 * @param daysInMonth The number of days in the month.
	 */
	public static void printMonthDays(int startDay, int daysInMonth) {
		final char CHAR_BETWEEN_DAYS = ' ';
		final int DAYS_IN_A_WEEK = 7;
		final int LOWEST_SINGLE_DIGIT_DAY = 1;
		final int HIGHEST_SINGLE_DIGIT_DAY = 9;

		formatCalendarHeading(CHAR_BETWEEN_DAYS, startDay * 4);
		
		for (int day = 1; day <= daysInMonth; day++) {
			if (day >= LOWEST_SINGLE_DIGIT_DAY && day <= HIGHEST_SINGLE_DIGIT_DAY) {
				formatCalendarHeading(CHAR_BETWEEN_DAYS, 2);
			} else {
				formatCalendarHeading(CHAR_BETWEEN_DAYS, 1);
			}
			
			System.out.print(day);
			
			formatCalendarHeading(CHAR_BETWEEN_DAYS, 1);
			
			startDay++;
			
			if (startDay % DAYS_IN_A_WEEK == 0) {
				System.out.println();
			}
		}
		System.out.println();
	}
	
	/**
	 * This returns the days that have past since January 1st, the first day of a year, from
	 * a given month and day. Used for only the same calendar year.
	 * 
	 * @param firstMonthOfYear This represents January, the first month of the year.
	 * @param firstDayOfMonth This represents the first day of a month.
	 * @param dayOfDate This is the desired day that will print out in the calendar title.
	 * @param year This is the desired year that will print out in the calendar year.
	 * @return daysPastFirstOfMonth The int days between the first day of the first month and your chosen month and day.
	 */
	public static int getDaysPastJan1(int firstMonthOfYear, int firstDayOfMonth, int chosenMonth, int dayOfDate, int year) {
		int daysPastFirstOfMonth = 0;
		
		if (firstMonthOfYear == chosenMonth) {
			daysPastFirstOfMonth = dayOfDate - firstDayOfMonth;
			return daysPastFirstOfMonth;
		}

		// Add number of days for first month
		daysPastFirstOfMonth += getDaysInMonth(firstMonthOfYear, year) - firstDayOfMonth;

		// Add number of days for in-between months
		for (int i = (firstMonthOfYear + 1); i < chosenMonth; i++) {
			int daysInMonth = getDaysInMonth(i, year);
			daysPastFirstOfMonth += daysInMonth;
		}

		// Add number of days for last month
		daysPastFirstOfMonth += dayOfDate;

		return daysPastFirstOfMonth;
	}

	/**
	 * This will return the day of the week (Mon, Tue, etc.)
	 * 
	 * @param month The chosen month.
	 * @param day The chosen day for the given month.
	 * @param year The year that has been input by the user.
	 * @param startDayOfWeek The day that the week will start on (1, 2, 3.. 7).
	 * @return weekDay This is the day of the week (Mon, Tue, etc).
	 */
	public static String getWeekDay(int month, int day, int year, int startDayOfWeek) {
		
		String weekDay = " ";

		if (month <= 0 || month > 12 || day <= 0 || day > 31) {
			return "Invalid User Input";
		}

		// First calculate number of days between start of year and date
		int daysPastJan1 = getDaysPastJan1(1, 1, month, day, year);

		// Then do math to what day of week this corresponds to
		int dayOfWeek = daysPastJan1 % 7;
		dayOfWeek = (startDayOfWeek + dayOfWeek) % 7;

		switch (dayOfWeek) {
		case 0:
			weekDay = "Sunday";
			break;
		case 1:
			weekDay = "Monday";
			break;
		case 2:
			weekDay = "Tuesday";
			break;
		case 3:
			weekDay = "Wednesday";
			break;
		case 4:
			weekDay = "Thursday";
			break;
		case 5:
			weekDay = "Friday";
			break;
		case 6:
			weekDay = "Saturday";
			break;
		}

		return weekDay;
	}

	/**
	 * First prompts for the year and the day of the week of January 1st and then
	 * prompts for any given date (month and day) of that same year that user wants
	 * to find day of week for. Prints out day of week for given date and a monthly
	 * calendar for given month.
	 *
	 * @param args unused
	 */
	public static void main(String[] args) {
		final char FIRST_MONTH = 1;
		final char LAST_MONTH = 12;
		final int DAYS_IN_A_WEEK = 7;

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter year: ");
		int year = input.nextInt();
		
		System.out.print("Enter day of week of Jan 1 (0-Sunday, 1-Monday, etc): ");
		int startDay = input.nextInt();
		int originalStartDay = startDay;

		System.out.println();
		System.out.println("Lets find the day of a week for any given date on this calendar year!");
		
		System.out.print("Enter Month of Desired Date (1-Jan, 2-Feb, etc): ");
		int monthOfDate = input.nextInt();
		
		System.out.print("Enter Day of Desired Date (1-1st of month, 2-2nd of month, etc): ");
		int dayOfDate = input.nextInt();
		
		System.out.println();
		System.out.println(getMonthName(monthOfDate) + " " + dayOfDate + ", " + year + " is a "
				+ getWeekDay(monthOfDate, dayOfDate, year, originalStartDay));

		for (int month = FIRST_MONTH; month < monthOfDate; ++month) {
			int daysInMonth = getDaysInMonth(month, year);
			startDay = (startDay + daysInMonth) % DAYS_IN_A_WEEK;
		}
		
		String monthName = getMonthName(monthOfDate);
		printCalendarHeading(monthName, year);
		
		int daysInMonth = getDaysInMonth(monthOfDate, year);
		printMonthDays(startDay, daysInMonth);
		
		input.close();

	}
}
