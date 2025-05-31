import java.util.Scanner;
public class GreatestofThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Please Enter second number: ");
        int b= sc.nextInt();
        System.out.println("Please Enter third number: ");
        int c = sc.nextInt();

        if(a>=b && a>=c){
            System.out.println(a+"  is the largest number");
        }else if(b>=c){
            System.out.println(b+"  is the largest number");
        }else{
            System.out.println(c+"  is the largest number");
        }

    }
}