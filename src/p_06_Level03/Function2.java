import java.util.Scanner;
public class Function2 {
    public static void main(String[] args) {
        my();     // calling my function
        Hi();     // calling Hi function
    }

    public static void my() {
        //printing using while loop
        int row = 0;
        while (row < 5) {
            System.out.print("*");

            int i = 0;
            while (i < row) {
                System.out.print(" *");
                i++;
            }
             System.out.println();
            row++;
           }
        }
        public static void Hi(){
             // printing Square pattern
            for(int i=1; i<=5; i++){
                for(int j=1; j<=5; j++){
                    System.out.print(" *");
                }
                System.out.println();
            }
        }
    }



