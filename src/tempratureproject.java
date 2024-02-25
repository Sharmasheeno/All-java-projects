
import java.sql.SQLOutput;
import java.util.Scanner;

public class tempratureproject{
    public static void main(String[]args){
        System.out.println("Changing 35 Calcius to Farenheit ");
        System.out.println((9.0/5)*35+32);

        Scanner inputNumber= new Scanner(System.in);
        int today,meetingDay;
        final int DOW=7;
        System.out.println("Enter today as a Number:");
        today=inputNumber.nextInt();
        meetingDay=(today + 10)%DOW;
        System.out.println("Meeting day="+meetingDay);


    }
}
