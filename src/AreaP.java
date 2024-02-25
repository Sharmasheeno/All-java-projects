import java.util.Scanner;

public class AreaP{
    public static void main(String[]args){
        //cumpute area of circle
        //declaring variables
        double radius;
        double area;
        //create object from scanner class
        Scanner input= new Scanner(System.in);
        System.out.println("Enter radius");
        radius=input.nextDouble();
        area=radius*radius*3.14159;
        System.out.println("area of circle is:"+area);

    }
}
