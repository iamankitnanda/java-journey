import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to SimpleInteresr calculator");
        System.out.println("Enter your principle amount Rs:  ");
        int principle = sc.nextInt();
        System.out.println("Enter your rate of interest:  ");
        float rate = sc.nextFloat();
        System.out.println("Enter your time for you borrow:  ");
        float time = sc.nextFloat();

        float si = (principle * rate * time )/ 100;
        System.out.println("This is your simpleinterest: " + si+" Rs");
    }
}
