import java.util.Scanner;
public class compliment {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int first=sc.nextInt();

        int result= ~first;
        System.out.println("Result: "+result);
    }
}
