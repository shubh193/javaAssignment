package day3;

public class Date {
	private int day;
	private int month;
	private int year;

	    // Default constructor
	    public Date() {}

	    public void setDate(int day, int month, int year) {
	        this.year = (year > 3000 || year < 1980) ? 2026 : year;
	        this.month = (month > 12 || month < 1) ? 1 : month;
	        
	        int maxDays = getMonthDays(this.month, this.year);
	        this.day = (day > maxDays || day < 1) ? 1 : day;
	    }

	    public static int getMonthDays(int month, int year) {
	        switch (month) {
	            case 4: case 6: case 9: case 11:
	                return 30;
	            case 2:
	                return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) ? 29 : 28;
	            default:
	                return 31;
	        }
	    }

	    public void addDays(int daysToAdd) {
	        day += daysToAdd;
	        while (day > getMonthDays(month, year)) {
	            day -= getMonthDays(month, year);
	            month++;
	            if (month > 12) {
	                month = 1;
	                year++;
	            }
	        }
	    }

	    public void addMonths(int monthsToAdd) {
	        month += monthsToAdd;
	        while (month > 12) {
	            month -= 12;
	            year++;
	        }
	        int maxDays = getMonthDays(month, year);
	        if (day > maxDays) day = maxDays;
	    }

	    public void addYears(int yearsToAdd) {
	        year += yearsToAdd;
	        int maxDays = getMonthDays(month, year);
	        if (day > maxDays) day = maxDays;
	    }

	    public String display() {
	        return String.format("%02d/%02d/%d", day, month, year);
	    }

	    
	    public int getDay() { return day; }
	    public int getMonth() { return month; }
	    public int getYear() { return year; }
	}
	
