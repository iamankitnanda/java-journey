import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Your number: ");
        int num = sc.nextInt();

        if (num%2==0) {
            System.out.println("This number is Even.");
        }else{
            System.out.println("This number is Odd");
        }
    }
}


