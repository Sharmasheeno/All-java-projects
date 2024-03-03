import java.util.*;
public class SubtractionQuiz {
    public static void main(String[] args) {
        int num1 = (int)(Math.random() *10);
        int num2 = (int)(Math.random() *10);
        if (num1 < num2){
            int tempNum = num1;
            num1 = num2;
            num2 = tempNum;
            System.out.println("What is " + num1 + " - " + num2);
            Scanner input = new Scanner(System.in);
            int answer =input.nextInt();
            if (num1 - num2 == answer){
                System.out.println("Your are Correct");
            } else {
                System.out.println("You are incorrect");

            }
        }
    }
}