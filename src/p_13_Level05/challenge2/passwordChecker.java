package p_13_Level05.challenge2;
import java.util.Scanner;
public class passwordChecker {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        String password;
        do  {
            System.out.println("Please Enter your pasword: ");
            password=sc.next();
            System.out.println("pasword must contain 8 letters");
            }while(!isValidPassword(password));
        System.out.println("Thanks for entering valid password");
        }
        public static boolean isValidPassword(String password){
            return password.length() > 8;
        }
    }


