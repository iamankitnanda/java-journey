import java.util.Scanner;
public class ComputeDigit {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num= sc.nextInt();
        int sum=sumOfDigits(num);
        System.out.println("Sum of Digits is " +sum);

    }
    public static int sumOfDigits(int num){
//        Logic:   suppose number hai 236
//           step-1: 236 % 10 = 6(last digit)
//           step-2: 236/10 = 23(ab number ban gya 23)
//           Reapeat
//           step-3:23 % 10 = 3(2nd last digit)
//           step-4: 23/10 = 2(ab number ban gya 2)
//          phir se repeat
//                   2 % 10= 2
//                   2/10 = 0(done)
        int sum=0;
        while(num > 0){
            sum +=(num % 10);    // aur bhi short kar sakte hai lekin abhi smjhne ke liye shi hai
            num /=10;              // isse bhi kar sakte hai jaise num/=10;
        }
        return sum;

    }
}
