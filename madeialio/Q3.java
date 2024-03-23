
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for a value in miles
        System.out.print("Enter the distance in miles: ");
        double miles = scanner.nextDouble();

        // Convert miles to kilometers
        double kilometers = miles * 1.6;

        // Display the result
        System.out.println(miles + " miles is " + kilometers + " kilometers.");

        scanner.close();
    }
}

