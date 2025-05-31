import java.util.Scanner;
public class BitwiseOddEven {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your  number");
        int num=sc.nextInt();

        if((num & 1)== 1) {
            System.out.println("Odd");
        }else{
            System.out.println("Even");
        }
    }
}
