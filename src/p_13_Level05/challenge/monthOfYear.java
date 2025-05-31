package p_13_Level05.challenge;
import java.util.Scanner;;
public class monthOfYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Number: ");
        int num = sc.nextInt();
        String monthName=getMonth(num);
        System.out.println("Your month name is: "+monthName);
    }
    public static String getMonth(int num){
        return switch(num){
            case 1 ->"jnauray";
            case 2 ->"February";
            case 3->"March";
            case 4 ->"April";
            case 5 ->"May";
            case 6 ->"june";
            case 7 ->"july";
            case 8 ->"Agust";
            case 9 ->"September";
            case 10 ->"October";
            case 11 ->"November";
            case 12->"December";
            default ->"Dusre gole se aya hai kya !!!!?";
        };
    }
 }