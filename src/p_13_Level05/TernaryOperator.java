import java.util.Scanner;
public class TernaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to number checker\n");
        System.out.println("please Enter your First Number:  ");
        int num1 = sc.nextInt();
        System.out.println("please Enter your Second  Number:  ");
        int num2 = sc.nextInt();
//        int great;
//        if(num1>num2){
//            great =num1;                // System.out.println(num1+ "is the greatest Number");
//        }else{
//         great =num2;                  // System.out.println(num2+ "is the greatest Number");
//        }
        int great = num1 > num2 ? num1 : num2; // (syntax: condition? expression1 : expression2)
        System.out.println(great + " is the greatest Number");
    }
}