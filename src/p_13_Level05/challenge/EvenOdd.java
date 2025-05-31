import java.util.Scanner;
public class EvenOdd {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your Number: ");
        int num=sc.nextInt();
        String result=num%2==0? "Even" : "odd";
        System.out.println("Your Number is: "+result);
    }
}
