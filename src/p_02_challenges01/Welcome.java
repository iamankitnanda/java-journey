import java.util.Scanner;
public class Welcome {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter your Name:  ");
        String name=input.nextLine();
        System.out.println("Welcome  "+name+" to JAVA course");
    }
}
