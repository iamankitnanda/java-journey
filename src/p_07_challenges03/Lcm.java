import java.util.Scanner;
public class Lcm{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to LCM");
        System.out.println("Enter your number:  ");
        int first=sc.nextInt();
        System.out.println("Enter your Number: ");
        int second=sc.nextInt();
        int lcm= lcm(first,second);
        System.out.println("LCM of the two number is: "+ lcm);
    }
    public static int lcm(int first, int second){
        int i=1;
        while(i<= second){
             int factor= first * i;
             if(factor  % second == 0){

                 return factor;
             }
            i++;
        }
        return 0;

    }
}
