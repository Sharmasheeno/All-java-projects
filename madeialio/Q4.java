
import java.util.Scanner;
public class Q4 {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for their weight in kilograms
        System.out.print("Enter your weight in kilograms: ");
        double weight = scanner.nextDouble();

        // Prompt the user for their height in meters
        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble();

        // Calculate the BMI
        double bmi = weight / (height * height);

        // Display the BMI
        System.out.printf("Your Body Mass Index (BMI) is: %.2f%n", bmi);

        scanner.close();
    }
}

