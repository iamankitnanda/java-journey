import java.util.Scanner;
public class TwoDimArray {
    public static void main(String[] args) {
       // int[][] myArr = new int[2][3];
      //  myArr[0][0] = 9;
        int[][] arr = {{1,2,3},{4,5,6}};
        System.out.println(arr[1][2]);   // output: 6

        //Traversal
        int i=0;   // for row
        while(i < arr.length){
            int j=0;       // for coloumn
            while (j < arr[i].length) {
                System.out.print(arr[i][j]+ " "); // printing the array
                j++;
            }
            System.out.println();
            i++;
        }
    }
}

