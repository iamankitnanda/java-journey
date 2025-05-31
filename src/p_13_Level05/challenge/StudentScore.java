package p_13_Level05.challenge;
import java.util.Scanner;
public class StudentScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Scorer: ");
        int score = sc.nextInt();
        String category = score > 80 ? "High" : (score > 50 ? "moderate" : "low");
        System.out.println("Your category is: " + category);
    }
}