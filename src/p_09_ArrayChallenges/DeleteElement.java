import java.util.Scanner;
public class DeleteElement {
    public static void main(String[] args) {
        System.out.println("Welcome to Array Deletation \n");
        int[] arry = ArrayUtility.inputArray();
        Scanner sc = new Scanner(System.in);
        System.out.println("Now, Enter the number you want to delete: ");
        int toDelete = sc.nextInt();
        int[] newArr = deleteNumber(arry, toDelete);

        System.out.println("Here is your new Array");
        ArrayUtility.displayArray(newArr);
    }

        public static int[] deleteNumber(int[] arry, int toDelete) {
        int occ = OccuranceOfElement.count(arry, toDelete);
       if(occ==0){
           return arry;
       }
       int newSize = arry.length - occ;
       int[] newArr = new  int[newSize];

        int i=0; int j=0;
        while(i < arry.length){
            if(arry[i]!=toDelete){
                newArr[j] = arry[i];
                j++;
            }
            i++;
        }
       return newArr;
    }
}


