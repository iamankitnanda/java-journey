import java.util.Scanner;
public class CompundInterest {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your principle amount Rs:  ");
        int principle = sc.nextInt();
        System.out.println("Enter your rate of interest:  ");
        float rate = sc.nextFloat();
        System.out.println("Enter your time for you borrow:  ");
        float time = sc.nextFloat();

        double cint=principle * Math.pow((1+ rate/100), time);
        System.out.println("Your CompundInterest: "+cint);
    }
}
