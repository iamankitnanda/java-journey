import java.util.Scanner;
public class array {
    public static void main(String[]argts){
     // int[] myArr = new int[5];      //ye ek type  hai
//        myArr[0] = 98;
//        myArr[1] = 97;
//        myArr[2] = 96;
//        myArr[3] = 95;
//        myArr[4] = 94;
        int[] myArr ={1,2,3,4,5,6,7,8,9,10}; //ye aur ek type ka hai

//        System.out.println(myArr[0]);
//        System.out.println(myArr[2]);
//        System.out.println(myArr[1]);
//        System.out.println(myArr[3]);
//        System.out.println(myArr[4]);
        //Array Traversal (matlab pura ghum ke ana)
        int index =0;
        while(index < myArr.length){
            System.out.println(myArr[index]);
            index++;
        }

        String[] strArr =new String[4];   //Array ka size 4 he hai
        strArr[0] = "My String";
        System.out.println(strArr.length);

        String[] newStrArr ={"first" , "second" ,"third"};   // Array ka size 3 hai
        System.out.println(newStrArr.length);
    }
}
