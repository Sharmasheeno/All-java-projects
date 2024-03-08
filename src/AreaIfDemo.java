import java.util.Scanner;
public class AreaIfDemo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of an area");
        double radius =scanner.nextDouble();
        if(radius>=0){
            double area=radius*radius*3.14159;
            System.out.println("the area of this:"+radius+  "is"+area);
        }
        else{
            System.out.println("you input is Negative number");
        }
    }

}
