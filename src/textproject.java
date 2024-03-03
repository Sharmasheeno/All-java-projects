import java.util.*;

public class textproject {
    public static void main(String[]args){
       final double TAX = 20;
       double price;
       String car_name;
       String car_model;
       Scanner input = new Scanner(System.in);
       System.out.println("Enter the price");
       price=input.nextDouble();
       System.out.println("Enter the car name");
       car_name=input.next();
       System.out.println("Enter the car model");
       car_model=input.next();
       double total_price=price+TAX;
       System.out.println("The car name is"+" "+car_name+" "+"And the car model is"+" "+car_model+" "+"And the Total price is " + total_price);
    }
}
