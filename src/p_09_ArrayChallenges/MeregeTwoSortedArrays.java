import java.util.Scanner;
public class MeregeTwoSortedArrays {
    public static void main(String[] args) {
        System.out.println("Welcome to Merging Sorted Arrays \n");
        int[] arr1 = ArrayUtility.inputArray();
        int[] arr2 = ArrayUtility.inputArray();
        int[] merge =merger(arr1,arr2);
        System.out.println("Your merged Array is");
        ArrayUtility.displayArray(merge);
    }
    public static int[] merger(int[] arr1, int[] arr2){
      int newSize = arr1.length+arr2.length;
      int[] newArr=new int[newSize];
      int i=0, j=0, k=0;
      while(i< arr1.length || j < arr2.length){
          if(arr1[i] < arr2[j]){
              newArr[k] = arr1[i];
              i++;
              k++;
          }else{
              newArr[k]= arr2[k];
              k++;
              j++;
          }
      }
      return newArr;
    }
}