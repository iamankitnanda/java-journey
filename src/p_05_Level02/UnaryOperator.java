import java.util.Scanner;
public class UnaryOperator {
    public static void main (String[]args){
        int x= 5;
        int y= -x;
        int z= -y;
        System.out.println(z);

       int a=5;
       a =a+1;
        System.out.println(a);
       a +=1;
         System.out.println(a);
      a++;
        System.out.println(a);
        ++a;
        System.out.println("Watching increment");
      int p=5;
       System.out.println(p++);  //post increment (fist p ki value assign then increment)
      System.out.println(p);    // printing the increment value

       System.out.println(++p);  // pre-increment(first value increment then value assign to p)
        System.out.println(p);    // printing the increment value

        int q= 10;
        System.out.println(--q);  //
        System.out.println(q);

        System.out.println(q--);
        System.out.println(q);
    }
}
