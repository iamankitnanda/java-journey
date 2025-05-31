import java.util.Scanner;
public class Arith {
     public  static void main(String[]args) {
        Scanner sc = new Scanner(System.in); {
             System.out.println("Welcome to Arithmatic challenge");
             System.out.println("Enter the first number: ");
            int first = sc.nextInt();
             System.out.println("Enter the second number");
            int second = sc.nextInt();

            int add=first+second;
             System.out.println("Addition: "+add);
            int sub=first-second;
             System.out.println("substraction: "+sub);
            int multi=first*second;
             System.out.println("multiplication: "+multi);
            int div=first/second;
             System.out.println("division: "+div);
            int mod=first%second;
             System.out.println("modular: "+mod);

        }
    }
    }


