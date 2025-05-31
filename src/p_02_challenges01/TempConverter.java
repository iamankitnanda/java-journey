import java.util.Scanner;
public class TempConverter {
     public static void main(String[]args){
         Scanner sc=new Scanner(System.in);
         System.out.println("Welocome!");
         System.out.println("Enter your temp in F: ");
         float fah=sc.nextFloat();
         float cel=(fah-32) * 5.0f / 9.0f;
         System.out.println("Temp in celsius is "+ cel+"c");
     }
}
