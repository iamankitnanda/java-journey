import java.util.Scanner;
public class PosiNegiZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Your number: ");
        int num = sc.nextInt();

        if (num > 0) {
                    System.out.println("This number is positive.");
        }else if(num < 0){
                    System.out.println("This number is negative.");
        }else if(num == 0){
                    System.out.println("This number is zero.");
             }
        }
    }
