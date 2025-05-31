package p_13_Level05.challenge2;
import java.util.Scanner;
public class MultiplicationTableForLoop {
    public static void main(String[]args){
        System.out.println("Welcome to Multiplication Table");
        System.out.println("Enter the Table number: ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        for(int i=1; i<=10; i++){
            System.out.println(num+" X "+i+" = "+(num * i));
        }
    }
}
