import java.util.Scanner;

public class AdditionQuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1 = (int) (System.currentTimeMillis() % 10);
        int number2 = (int) (System.currentTimeMillis() / 10 % 10);
        System.out.print("What is the Addition of:" + number1 + "+" + number2);
        int answer = input.nextInt();

        System.out.println(number1 + number2 + " = " + answer+" "+ "is " +(number1+number2==answer));
    }
}