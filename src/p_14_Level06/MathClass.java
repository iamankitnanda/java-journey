package p_14_Level06;
import java.util.Scanner;
public class MathClass {
    public static void main(String[]args){
                 System.out.println(Math.abs(-55));
                 System.out.println(Math.ceil(5.07));
                 System.out.println(Math.floor(5.07));
                 System.out.println(Math.round(5.47));
                 System.out.println(Math.round(Math.random()*100));
                 System.out.println(Math.PI);
                 System.out.println(Math.sqrt(25));

                 for(int i=0; i< 10; i++){
                     long random=Math.round((Math.random() * 100));
                     System.out.println(random);
                 }
    }
}
