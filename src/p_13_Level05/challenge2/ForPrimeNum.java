package p_13_Level05.challenge2;
import java.util.Scanner;
public class ForPrimeNum {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to prime Number checker");
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        System.out.println("Your number is "+(isPrime(num) ? "prime" : "Not prime"));
    }
    public static boolean isPrime(int num){
        for(int i=2; i<num; i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
