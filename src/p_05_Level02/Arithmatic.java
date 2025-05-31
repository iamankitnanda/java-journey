import java.util.Scanner;
public class Arithmatic {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Arithmatic operators");
        System.out.println("Enter the First Number: ");
        int a=sc.nextInt();
        System.out.println("Enter the Second Number: ");
        int b=sc.nextInt();

        int sum=a+b;
         System.out.println("sum is: "+sum); //addition
        int sub=a-b;
         System.out.println("Subtraction is:"+sub); //substraction
        int mul=a*b;
         System.out.println("Multiplication:"+mul); //multiplication
        int rem=a%b;      //modulus(ye division nhi hai)   int rem=a%b;
        System.out.println("Remainder is:"+rem);
        int div=a/b;
        System.out.println("div is:"+div);
    }
}
