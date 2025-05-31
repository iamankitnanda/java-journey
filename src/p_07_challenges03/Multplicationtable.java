import java.util.Scanner;
public class Multplicationtable {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome!!!!!!!!!!!!");
        System.out.println("plz Enter your name: ");
        int num=sc.nextInt();
        printMultipleTable(num);
    }
    public static void printMultipleTable(int num){
        int i=1;
        while(i<=10){
            System.out.println(num + "x" + i + "=" + (num*i));
            i++;
        }
    }
}
