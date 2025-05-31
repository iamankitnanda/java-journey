package p_13_Level05.challenge;
import java.util.Scanner;
public class SwitchCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first  Number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second  Number: ");
        int num2 = sc.nextInt();
        System.out.print("Now Enter the Operation: ");
        String operation= sc.next();

        int result = switch(operation){
            case "+"-> num1+num2;
            case "-"-> num1-num2;
            case "/"-> num1/num2;
            case "*"->num1*num2;
            default -> -1;
        };
        System.out.println("Your ans is : "+result);
    }
}
