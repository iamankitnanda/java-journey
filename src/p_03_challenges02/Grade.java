import java.util.Scanner;
public class Grade{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter percantage: ");
        float per = sc.nextInt();

        if(per >= 90){
            System.out.println("You have got A grade");
           }else if(per >=75){
                  System.out.println("Good, you have got B");
        }else if(per >=60){
                   System.out.println("Work hard");
          }else{
             System.out.println("You Failed , but not in all . Go and Conquqre.");
          }
        }
    }

