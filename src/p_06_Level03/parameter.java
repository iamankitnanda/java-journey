import java.util.Scanner;
public class parameter {
    public static void main(String[]args){
        int num=sum(4,7);
        System.out.println("result: "+num);
        System.out.println(sum(22,77));
        System.out.println(sum(4, 9));
    }
    public static int sum(int first,int second){
        System.out.println("First num: "+first);
        System.out.println("Second num: "+second);
        int result=first+second;
        return result;
    }
}
