import java.util.Scanner;
public class RelationalOperator {
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
      System.out.println("please Enter Your age: ");
      int age=sc.nextInt();

      if(age >= 18){
        System.out.println("You are eligible for Driving");
      }else{
          System.out.println("You are not Eligible for Driving");
      }
  }
}
