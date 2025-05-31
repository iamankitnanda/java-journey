package p_13_Level05.challenge;
import java.util.Scanner;
public class AbsoluteValue {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your Number: ");
        int num=sc.nextInt();
        int result=num>=0? num : -num;
        System.out.println("Absolute value is: "+result);
    }
}
