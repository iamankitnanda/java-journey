import java.util.Scanner;
public class Function {
    public static void main(String[]args){
        System.out.println("In main method");
        greeting();
        System.out.println("Method calling complete");
        greeting();
    }
     public static void greeting(){
         System.out.println("Hello,World");
     }
}
