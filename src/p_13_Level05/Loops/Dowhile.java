package p_13_Level05.Loops;
import java.util.Scanner;
public class Dowhile {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
//        System.out.print("Enter your Age: ");
//        int age= sc.nextInt();
//       while(age< 0 || age > 100) {
//           System.out.print("Enter your Age: ");
//           age= sc.nextInt();
//       }
//       System.out.println("Your age is: "+age);
        int age;
        do{
            System.out.println("Please enter your age: ");
            age =sc.nextInt();
        }while(age<0 || age > 100);
            System.out.println("your age is: "+age);
    }
}