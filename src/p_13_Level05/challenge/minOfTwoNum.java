package p_13_Level05.challenge;
import java.util.Scanner;
public class minOfTwoNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        minOfTwoNum ternary = new minOfTwoNum();
        int min = ternary.min(num1, num2);
        System.out.println("Minimum number is: " + min);
    }
    public int min(int num1, int num2) {
        return num1 < num2 ? num1 : num2; //using ternary opertaor instaed of if-else statement
    }
}
