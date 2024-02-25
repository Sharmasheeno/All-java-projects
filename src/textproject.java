import java.util.*;

public class textproject {
    public static void main(String[]args){
        final double TAX=65;
        //declare variables
        double car_price;
        String car_name;
        String car_model;
        //creating object from scanner class
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the car name");
        car_name=input.next();
        System.out.println("Enter the car price");
        car_price=input.nextDouble();
        System.out.println("Enter the car model");
        car_model=input.next();
        double total_price =car_price+TAX;
        //display total_price
        System.out.println("The carname is:"+car_name+"the carmodel is:"+car_model+"the totalprice is:"+total_price);

    }
}
