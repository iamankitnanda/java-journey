import java.util.Scanner;
public class ifelse {
    public static void main(String[]args){
        boolean isMale= false;
        String name = "Madhu";

        if(isMale){
            System.out.println("Mr "+name );   // agar condition true hai tabhi  chalega
        }else{
             System.out.println("Galat hai" +name);  // agar if condition fail hua tho he chaleag
        }
           boolean isSenior= true;  // modify and see the result
           boolean isanAdult= false; // modify and see the result

           if(isSenior){
                 System.out.println("Hello chacha ji.");
           }else{
                if(isanAdult){
                    System.out.println("Hello Adult");
                }else{
                    System.out.println("choti bacchi ho kya.");
                }
           }
    }
}