
import java.util.Scanner;
public class Q7 {
    

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Constants for conversion
        final int MINUTES_IN_HOUR = 60;
        final int HOURS_IN_DAY = 24;
        final int DAYS_IN_YEAR = 365;

        // Prompt the user to enter the number of minutes
        System.out.print("Enter the number of minutes: ");
        long minutes = scanner.nextLong();

        // Calculate the years and days
        long minutesInYear = MINUTES_IN_HOUR * HOURS_IN_DAY * DAYS_IN_YEAR;
        long years = minutes / minutesInYear;
        long days = (minutes % minutesInYear) / (MINUTES_IN_HOUR * HOURS_IN_DAY);

        // Display the result
        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days.");

        scanner.close();
    }
}


