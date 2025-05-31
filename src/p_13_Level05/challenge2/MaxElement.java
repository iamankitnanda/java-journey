package p_13_Level05.challenge2;
import java.util.Scanner;
public class MaxElement {
    public static void main(String[]args){
        System.out.println("Welcome to finding the maximum");
        int[] arr=ArrayUtility.inputArray();

        int max=Integer.MIN_VALUE;
        for(int num: arr){
            if(max < num){
                max=num;
            }
        }
        System.out.println("Mxaimum number is: "+max);
    }
}
