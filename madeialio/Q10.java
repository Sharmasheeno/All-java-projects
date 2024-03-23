import java.util.Scanner;
public class Q10 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a three-digit integer
        System.out.print("Enter a three-digit integer: ");
        int number = scanner.nextInt();

        // Check if the number is a negative integer and convert it to positive if it is
        number = Math.abs(number);

        // Check if the number is a three-digit integer
        if (number >= 100 && number <= 999) {
            int Digit1 = number / 100;
            int Digit3 = number % 10;
            
            // Compare the first and last digit
            if (Digit1 == Digit3) {
                System.out.println(number + " is a palindrome.");
            } else {
                System.out.println(number + " is not a palindrome.");
            }
        } else {
            System.out.println("Error: You must enter a three-digit integer.");
        }
        scanner.close();
    }
}

