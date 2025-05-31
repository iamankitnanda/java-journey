import java.util.Scanner; //USER INPUT USING Scanner Class (:
public class input {
      public static void main(String[]args){
          Scanner sc=new Scanner(System.in);
          System.out.print("Enter your name plz!");
          String name=sc.nextLine();
          System.out.println("Good Morning  "+name);
          System.out.print(name+"Also tell me your age");
          int age=sc.nextInt();
          System.out.println("Your age is:  "+age);
      }
}
