import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer number greater than 0: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("The number must be greater than 0. Please try again.");
        } else {
            if (number % 3 == 0 && number % 5 == 0) {
                System.out.println("fizzbuzz");
            } else if (number % 3 == 0) {
                System.out.println("fizz");
            } else if (number % 5 == 0) {
                System.out.println("buzz");
            } else {
                System.out.println("The number is not divisible by 3 or 5.");
            }
        }

        scanner.close();
    }
}