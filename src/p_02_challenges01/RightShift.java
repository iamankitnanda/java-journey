import java.util.Scanner;
public class RightShift {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int first=sc.nextInt();

        int result= first >> 1;   //leftshift, you can give any number of shift
        System.out.println("Result: "+result);
    }
}
