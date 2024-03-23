
import java.util.Random;
import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Generate three single-digit integers
        int number1 = random.nextInt(10); // 0-9
        int number2 = random.nextInt(10); // 0-9
        int number3 = random.nextInt(10); // 0-9

        // Calculate the correct answer
        int correctAnswer = number1 * number2 * number3;

        // Ask the user to enter the answer
        System.out.printf("What is %d * %d * %d? ", number1, number2, number3);
        int userAnswer = scanner.nextInt();

        // Check the user's answer and respond accordingly
        if (userAnswer == correctAnswer) {
            System.out.println("Congratulations! Your answer is correct.");
        } else {
            System.out.printf("Sorry, that's incorrect. The correct answer is %d.%n", correctAnswer);
        }

        scanner.close();
    }
}

