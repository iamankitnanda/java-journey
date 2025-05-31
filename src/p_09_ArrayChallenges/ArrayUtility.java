import java.util.Scanner;
//Utility class for Array related Operations
public class ArrayUtility {
    //Method to Take array input from the user
    public static int[] inputArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the number of elements:  ");//Ask for the number of elements
        int size = sc.nextInt(); //Store the arrray size
        int[] nums = new int[size]; //Creat an Array of given size
        int i = 0;
        while (i < size) {
            //Ask for each elements one by one
            System.out.print("Please Enter element no  " + (i + 1) + ":"); //(i+1) is position of element
            nums[i] = sc.nextInt(); //Store the input in the array
            i++;
        }
        return nums; //Return the filled Array
    }
    public static void displayArray(int[] arr){
        int i=0;
        while(i <  arr.length){
            System.out.println(arr[i] + " ");
            i++;
        }
        System.out.println();
    }
}
