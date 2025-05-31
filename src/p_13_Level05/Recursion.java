package p_13_Level05;
import java.util.Scanner;
public class Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = sc.nextInt();
        long fact=factorial(num);
        System.out.println("Your factotial is: "+fact);
    }
    //Recursive call
    public static long factorial(int num){
        System.out.println("function called for: "+num);
        if(num==1) {
            return 1;
        }
        return num*factorial(num-1);
    }
//        public static long factorialit(int num){
//        long result=1;
//        for(int i=1; i<=num; i++){
//            result*=i;
//        }
//        return result;
    }

