import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = sc.nextInt();
        int a = num;
        int result = 0;

        while(num!=0){   //jab num 0 nhi hoga
            int digit = num % 10; // eg. 153 % 10 = 3
            result +=(digit * digit * digit); //3 * 3 * 3 = 27
            num/=10; // 153/10 = 15(yeh hoga new Number )
        }
        if(result == a){
            System.out.println(a +" yes armstrong");
        }else{
            System.out.println(a +" Not a armstrong");
        }
    }
}