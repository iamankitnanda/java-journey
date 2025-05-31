import java.util.Scanner;
public class AND {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int first=sc.nextInt();
        System.out.println("Enter the second number");
        int sec=sc.nextInt();

        int result= first & sec;
        System.out.println("Result: "+result);
    }
}
