package p_13_Level05.challenge2;
import java.util.Scanner;
public class NumberGuess {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num=5, guess;
        System.out.println("Welcome to Number guessing Game!");
        do{
            System.out.println("please guess the number between 1 to 10");
            guess=sc.nextInt();
            System.out.println("you are getting closer ");
        }while(num!=guess);
        System.out.println("You successfully guessed the number(:");
    }
}
