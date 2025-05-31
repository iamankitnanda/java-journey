import java.util.Scanner;
public class ageCalculator{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to AgeCalculator");
        System.out.println("plz enter your age");
        int age=sc.nextInt();

        if(age>=65){
            System.out.println("You are a senior citizen");
        }else if(age>=20){
            System.out.println("you are a adult");
        }else{
            System.out.println("you are a child");
        }
     }
    }