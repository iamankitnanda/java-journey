import java.util.Scanner;
public class Logical {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age=sc.nextInt();
        System.out.println("Are You a Female?(true/false)");
        boolean female=sc.nextBoolean();

        if(age< 5 ){
            System.out.println("You got 75% discount");
        }else if(female){
            System.out.println("You got 50% discount");
        }else if(age > 60){
            System.out.println("You got 25% discount");
        }else{
            System.out.println("You got no discount");
        }
    }
}
