import java.util.Scanner;
public class Arraysum {
    public static void main(String[]args){
         int[] numArray = ArrayUtility.inputArray(); //Take input from Utility Method
         long sum=sum(numArray); // Calculatae sum of Elemnts
         double avg=average(numArray);  //Calculate average of elements
         System.out.println("Sum of the numbers is: "+sum);
         System.out.println("Average of the numbers is: "+avg);
    }
    //Method to calculate sum of elements in the Array
    public static long sum(int[] numArray){
        long sum=0;
        int i=0;
        while(i < numArray.length){
            sum += numArray[i];
            i++;
        }
        return sum;
    }
    //Method to calculate average of elements in the Array
    public static double average(int[] numArray){
        double sum =sum(numArray);  // Reuse sum method
        return (sum / numArray.length); //Average = total sum/number of Elements
    }
}
