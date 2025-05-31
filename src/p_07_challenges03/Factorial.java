import java.util.Scanner;
public class Factorial {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to fcatorial");
        System.out.println("Pleasem enter your Number: ");
        int num=sc.nextInt();
        long fact=factorial(num);
        System.out.println("Factorial is  "+fact);

    }
    public static long factorial(int num){
        if(num < 0){
            System.out.println("Factorial is not defined for Negative Numbers.");
            return -1; //just a signal, not actual factorial
        }
        if(num < 2){          //kyu ki 2 se nuche ka factorial 1 he hai
            return 1;
        }
        long fact=1;
        int i=1;
        while(i <= num) {
            fact = fact *= i;   //fact = fact * i
            i++;
        }
        return fact;
    }
}
