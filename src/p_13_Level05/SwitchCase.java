import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your DAY of the week in number: ");
        int day = sc.nextInt();
        // oldSwitch();
        newSwitch(day);
    }
    public static void newSwitch(int day) {
        String dayStr = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tueseday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Sataurday";
            case 7,8 -> "Sunday"; //isme 7 & 8 dono he sunday print karenge
            default -> "Invalid Number";
        };
        System.out.println(dayStr);
    }
    public static void oldSwitch(int day) {
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tueseday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                //    System.out.println("Sataurday"); //fall through (matlab 6 aur 7 dono Sunday print karenge)
                //    break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid number");
                break;
        }
    }
}

