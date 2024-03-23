
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Prompt the user for their age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Display the personalized greeting
        System.out.println("Hello " + name + ", you are " + age + " years old.");

        scanner.close();
    }
}

