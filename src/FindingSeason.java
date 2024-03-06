import java.util.Scanner;
public class FindingSeason {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        // Prompt the user to enter a month number (1-12)
        System.out.print("Enter a month number (1-12): ");
        // Read the user input as an integer
        int month = scanner.nextInt();
        // Declare a string variable to store the season
        String season;
        // Use if else statements to determine the season based on the month number
        if (month == 1 || month == 2 || month == 3) {
            season = "Winter";
        } else if (month == 4 || month == 5 || month == 6) {
            season = "Spring";
        } else if (month == 7 || month == 8 || month == 9) {
            season = "Summer";
        } else if (month == 10 || month == 11 || month == 12) {
            season = "Autumn";
        } else {
            season = "Invalid month number";
        }

        // Display the result
        System.out.println("The season is: " + season);
    }
}



