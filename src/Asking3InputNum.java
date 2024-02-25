import java.util.Scanner;

public class Asking3InputNum{
    public static void main(String[]args){
        //calculate avarage
        double num1,num2,num3;
        //Creating object from Scanner class
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a numbers");
        num1=input.nextDouble();
        num2=input.nextDouble();
        num3=input.nextDouble();
        double avarage=(num1+num2+num3)/3;
        System.out.println("the avarage of three num is:"+avarage);

    }
}
