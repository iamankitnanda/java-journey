import java.util.Scanner;
public class LeapYear{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Year: ");
        int year = sc.nextInt();

        if (year % 400 == 0 || (year % 4==0 && year % 100 !=0) ) {  // iss code ko short kiya gya hai (long method bhi hai )
            System.out.println("This year is a leap year.");
        }else{
            System.out.println("This year is not a leap year ");
        }
    }
}
