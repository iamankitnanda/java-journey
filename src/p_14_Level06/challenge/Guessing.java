package p_14_Level06.challenge;
import java.util.Scanner;
public class Guessing {
    int random;

    Guessing(){
        random=(int)Math.ceil(Math.random()*100);
    }

    /**
     *
     * @param guessNumber the number that palyer guessed
     * @return
     * -Negative if the guessed number is smaller
     * -0 if the guessed number is correct.
     * -Positive if the guessed number is higher
     */


    int guess(int guessNumber){
        return guessNumber-random;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        Guessing game=new Guessing();
        System.out.println("Welcom to Game");
        int guess;
        int result;
        do{
            System.out.println("Guess the number:  ");
            guess =sc.nextInt();
            result=game.guess(guess);
            if(result==0){
                System.out.println("Great!!!!!correct");
            }else if(result < 0){
                System.out.println("please guess higher");
            }else{
                System.out.println("please guess lower");
            }
          } while(result!=0);
        }
    }



