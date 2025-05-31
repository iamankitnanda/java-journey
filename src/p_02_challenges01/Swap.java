//creat a program to swap two numbers
import java.util.Scanner;
public class Swap {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter value of A: ");
        int a=input.nextInt();
        System.out.println("Enter value of b: ");
        int b=input.nextInt();
//Here Alogrithm is important
        int c= a;   // first maine a ki value ko c ko assign kiya
        a = b;       // phir b ki value ko a ko assign kiya
        b= c;       // ab b ko c ki value assign kiya jo ki a ki original value thi
        System.out.println("Value of A is "+a);
        System.out.println("Value of B is "+b);
    }
}

