import java.util.Scanner;
public class OccuranceOfElement {
    public static void main(String[] args) {
        System.out.println("Welcome to Occurence of an Element in an Array");
        int[] arr = ArrayUtility.inputArray();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr the target:  ");
        int target = sc.nextInt();
        int result = count(arr, target);
        System.out.println("Element " + target + " occurs " + result + " times.");
    }

    //Method to count how many times target Occurs
    public static int count(int[] arr, int target) {
        int count = 0;
        int i = 0;
        while (i < arr.length) {
            if (arr[i] == target) {
                count++;
            }
            i++;
        }
        return count;
    }
}