import java.util.Scanner;
public class OddSum {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Pleasem enter your Number: ");
        int num=sc.nextInt();
        int sum=oddSum(num);
        System.out.println("OddSum till " +num+ " is " +sum);
    }
    public static int oddSum(int num){
        int sum=0;
        int i=1;
        while(i <= num){
            sum = sum + i;
            i +=2; //increment by 2
        }
        return sum;
    }
}
