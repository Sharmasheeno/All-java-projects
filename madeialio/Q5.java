
import java.util.Scanner;public class Q5 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the first point (x1, y1)
        System.out.print("Enter x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = scanner.nextDouble();

        // Prompt the user for the second point (x2, y2)
        System.out.print("Enter x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = scanner.nextDouble();

        // Calculate the distance using the correct formula
        // Math.pow(2, 3);
        double distance = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);

        // Display the result
        System.out.printf("The distance between the two points is: %.2f%n", distance);

        scanner.close();
    }
}

