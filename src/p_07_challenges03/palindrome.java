import java.util.Scanner;
public class palindrome {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to palindrome Number: ");
        System.out.println("please Enter Your Number: ");
        int num=sc.nextInt();
        boolean isPalindrome = isPalindrome(num);
        if(isPalindrome){
            System.out.println("your number is a Palindrome Number");
        }else{
            System.out.println("your number is not a Palindrome Number");
        }
    }
     public static boolean isPalindrome(int num){
        int reverse = reverse(num);
        return  num == reverse;   // reverse number ko original number se compare karenge
     }
     public static int reverse(int num){         // ye number ko reverse karne ka method hai
        int newNum = 0;
        while(num > 0){
            int digit = num % 10;
            newNum =newNum * 10 + digit;
            num /= 10;
         }
        return newNum;
     }
}
