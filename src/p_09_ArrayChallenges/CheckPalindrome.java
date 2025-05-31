import java.util.Scanner;
public class CheckPalindrome {
    public static void main(String[]args){
        System.out.println("Welcome to Palindrome Check post \n");
        int[] numArr =ArrayUtility.inputArray();
      //  isPalindrome(numArr);
        if(isPalindrome(numArr)){
            System.out.println("Yes,It's a Palindrome");
        }else{
            System.out.println("No,It's not a Palindrome");
        }
    }
    public static boolean isPalindrome(int[] arr){
        int i=0;
        int j =arr.length-1;
        while(i < j){
            if(arr[i]!=arr[j]){
                return false; //jaise mismatch milega , false return
            }
            i++;
            j--;
        }
        return true;//Agar pura loop pass ho gaya, tho palindrome hai
        }
    }

