package day3;

import day2.ConsoleInput;

public class DateTest {
	public static void main(String[] args) {
        Date objdate = new Date();

        System.out.println("--- Set Initial Date ---");
        System.out.print("Enter Day: ");
        int d = ConsoleInput.getInt();
        System.out.print("Enter Month: ");
        int m = ConsoleInput.getInt();
        System.out.print("Enter Year: ");
        int y = ConsoleInput.getInt();

        objdate.setDate(d, m, y);
        System.out.println("Current Date: " + objdate.display());

        System.out.println("Menu:");
        System.out.println("1. Add Days");
        System.out.println("2. Add Months");
        System.out.println("3. Add Years");
        System.out.print("Select an option: ");
        int choice = ConsoleInput.getInt();

        switch (choice) {
            case 1:
                System.out.print("Enter days to add: ");
                objdate.addDays(ConsoleInput.getInt());
                break;
            case 2:
                System.out.print("Enter months to add: ");
                objdate.addMonths(ConsoleInput.getInt());
                break;
            case 3:
                System.out.print("Enter years to add: ");
                objdate.addYears(ConsoleInput.getInt());
                break;
            default:
                System.out.println("Invalid Option!");
        }

        System.out.println("Updated Date: " + objdate.display());
    }
	
}
