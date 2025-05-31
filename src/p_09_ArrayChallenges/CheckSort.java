import java.util.Scanner;
public class CheckSort {
    public static void main(String[]args){
        System.out.println("Welcime to Array Sorting Check Post\n");
        //Input Array from User
        int[] arr=ArrayUtility.inputArray();
        //check if array is in increasing order
        boolean isInc = isIncreasing(arr);
        //check if array is in decreasing order
        boolean isDec =isDecreasing(arr);
        if(isInc || isDec) {      //if array is either inc or decreasing .it's sorted
            System.out.println("Your array is sorted");
        }else{
            System.out.println("Your array is not sorted");
        }
    }
    //Function to check if array is in increasing order
    public static boolean isIncreasing(int[] arr){
        int i=1;
        while(i < arr.length){
            //agar current element is smaller than previous , not increasing
            if(arr[i] < arr[i-1]){
                return false;
            }
                i++;
        }
        return true;
    }
    //Function to check if array is in decreasing order
    public static boolean isDecreasing(int[] arr){
        int i=1;
        while(i < arr.length){
            //agar current value is greater than previous,its not decreasing
            if(arr[i] > arr[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }
}
