import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to prime Number");
        System.out.println("Enter your number:  ");
        int num = sc.nextInt();
        boolean isprime=isprime(num);
        if(isprime){
            System.out.println("number is prime");
        }else{
            System.out.println("number is not prime");
        }
    }
    public static boolean isprime(int num){
        int i=2;
        while(i < num){
            if(num % i == 0){
                return false;
            }
            i++;
        }
        return true;
    }
}
