package p_13_Level05.Loops;
import java.util.Scanner;
public class BreakAndContinue {
    public static void main(String[]args){
        System.out.println("before loop");
        for(int i=1; i<10; i++){
            if(i==5){   //break beforre 111
                continue; //agar "break" ki jgha "continue" likhoge tho 5 ko hata ke bakim sab print hoga
            }
            System.out.println(i);
        }
     //   System.out.println("out of loop");
    }
}
