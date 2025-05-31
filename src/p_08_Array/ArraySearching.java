import java.util.Scanner;
public class ArraySearching {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int[] arr = {3,6,7,8,9,4,5,2,1,0};
               System.out.println("Welcome to Array Searching");
               System.out.println("Enter the Number you want to Search:  ");
               int num = sc.nextInt();
               boolean isFound = isFound(arr,num);
            if(isFound){
                System.out.println("Your number was found in the array");
            }   else{
                System.out.println("Your number was not found in the array");
            }
    }
    public static boolean isFound(int[] arr, int num){
        int index =0;
        while(index < arr.length){
            if(arr[index] == num){
                return true;
            }
          index++;
        }
        return false;
    }
}
