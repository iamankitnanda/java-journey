import java.util.Scanner;
public class WhileLoop {
    public static void main(String[]args) {
        int num = 1;   //initialization
        while (num <= 10) {   //Condition
            System.out.println(num);
            num = num + 1;  //updating the condition
        }
        int count=500;
        while(count >= 200){
        System.out.println(count);
        count -= 1;
    }
         Scanner sc=new Scanner(System.in);
        int i=0;  // initialization
        while(i <= 5){      //6 baar  koi bhi int print ho sakta hai
            int  a=sc.nextInt();
            System.out.println(a);
            i++;
        }

    }
}
