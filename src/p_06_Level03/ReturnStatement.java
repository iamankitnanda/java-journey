import java.util.Scanner;
public class ReturnStatement {
    public static void main(String[]args){

        greet();
         int first = readNumber() + 1;
         int sec= readNumber() + 2;
        int sum= first + sec;
        System.out.println("Sum is: "+sum );
    }
     public static void greet(){
         System.out.println("Welcome to calculator");
     }
     public static int readNumber(){
        Scanner sc=new Scanner(System.in);
         System.out.println("plz Enetr the number");
         int num=sc.nextInt();
         return num;

     }
}
