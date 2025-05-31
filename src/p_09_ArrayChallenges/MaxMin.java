import java.util.Scanner;
public class MaxMin {
    public static void main(String[] args) {
        int[] arr = ArrayUtility.inputArray();
        int maxi = maximum(arr);
         int mini=minimum(arr);
        System.out.println("The maximum number is:  " + maxi);
        System.out.println("The minimum number is:  "+mini);
    }
    public static int maximum(int[] arr) {
        if(arr.length == 0){
            return Integer.MIN_VALUE;
        }
        int max = arr[0];
        int i = 1;
        while (i < arr.length) {
            if (max < arr[i]) {
                max = arr[i];
            }
            i++;
        }
        return max;
    }
    public static int minimum(int[] arr) {
        int min = Integer.MAX_VALUE;
        int i = 0;
        while (i < arr.length) {
            if (arr[i] < min) {
                min = arr[i];
            }
            i++;
        }
        return min;
    }
}
