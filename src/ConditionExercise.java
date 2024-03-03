
import java.util.Scanner;

public class ConditionExercise {
    public static void main(String[] args) {
        double  Carprice;
        String Carname,Carmodel;
        final int TAXPRICE = 65;
        Scanner input = new Scanner(System.in);

//
//
        System.out.println("Enter name of the car: "  );
        Carname = input.next();

        System.out.println("Enter the car model: "  );
        Carmodel = input.next();

        System.out.println("Enter a price of Carprice" );
        Carprice = input.nextInt();

        if (Carprice > 3000) {
            double carPrice = Carprice * TAXPRICE;
            System.out.println("Name of the car is: " + Carname );
            System.out.println("Name the Model of car is: " + Carmodel);
            System.out.println("Price of the car is: " + carPrice);
        }
        else  {
            System.out.println("Enter valid Carprice please!");
        }


    }
}