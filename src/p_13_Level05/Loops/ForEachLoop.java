package p_13_Level05.Loops;
import java.util.Scanner;
public class ForEachLoop {
    public static void main(String[]args) {
        String[] array = new String[]{
                "Ram", "Shyam", "Sohan", "Ankit", "Shivam", "Rudro"
        };
       // printArray(array);
        printForEach(array);
    }
    //First method
        public static void printArray (String[]array){
              for(int i=0; i < array.length; i++){
                  System.out.println(array[i]);
              }
        }
        // Second method
        public static void printForEach(String[]array) {
            for (String name : array) {
                System.out.println(name);
            }
        }
    }

