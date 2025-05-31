package p_14_Level06.challenge;
import java.util.Scanner;
public class ArrayToString {
    public static void main(String[]args){
        String[] arr=new String[]{"This",
                "is", "the", "most", "and", "detailes",
                "course", "on", "java", "on youtube"};
                StringBuilder sb = new StringBuilder();
        for(String str: arr){
            sb.append(str).append(" ");
        }
        System.out.println(sb);
    }
}
