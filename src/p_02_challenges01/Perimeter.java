import java.util.Scanner;
public class Perimeter {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter all 4 sides in cm: ");
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        double d=sc.nextDouble();

        double per=a+b+c+d;
        System.out.println("Perimeter of rectangle is: "+per);
    }
}
