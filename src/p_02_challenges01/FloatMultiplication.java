import java.util.Scanner;
public class FloatMultiplication {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
       System.out.println("We are doing Float Multiplication");
        System.out.println("Enter first decimal number: ");
        double first=sc.nextDouble();
        System.out.println("Enter the second decimal number: ");
        double second=sc.nextDouble();

        double multiplication=first*second;
        System.out.println("\nThis is the Multiplication  : " +multiplication);




    }
}
