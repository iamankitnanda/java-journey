// Importing the Scanner class from the java.util package for taking user input
import java.util.Scanner;

// Declaring a public class named OccuranceForEach
public class OccuranceForEach {

    // Main method: the entry point of any Java program
    public static void main(String[] args) {
        // Creating a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Displaying a welcome message
        System.out.println("Welcome to finding occurances");

        // Calling a method inputArray() from ArrayUtility class to take array input from user
        // and storing the returned array in 'nums'
        int[] nums = ArrayUtility.inputArray();

        // Asking the user to enter the element whose occurrences they want to find
        System.out.println("Now, enter the number you want to search: ");
        int element = sc.nextInt();

        // Calling countOccurances() method to count how many times 'element' appears in 'nums'
        int occ = countOccurances(nums, element);

        // Displaying the total number of occurrences found
        System.out.println("Your element was found " + occ + " times");
    }

    // Method to count the occurrences of a given 'element' in the array 'nums'
    public static int countOccurances(int[] nums, int element) {
        // Variable to keep track of the occurrence count
        int occ = 0;

        // Enhanced for loop (for-each loop) to iterate through each element in 'nums'
        for (int num : nums) {
            // If current element matches the 'element' to be searched, increment 'occ'
            if (num == element) {
                occ++;
            }
        }
        // Return the final count
        return occ;
    }
}

