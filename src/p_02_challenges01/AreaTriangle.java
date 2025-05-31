import java.util.Scanner;
public class AreaTriangle {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("please Enter your base in cms: ");
        double base=sc.nextDouble();
        System.out.println("please Enter your hieght in cms: ");
        double hieght=sc.nextDouble();

        double area=0.5 * base * hieght;
        System.out.println("Area of Triangle: "+area+"cm2");



    }
}
