
//Note:
//        INSTANCE VARIABLE: Yeh variables class ke andar declare kiye jate hain lekin kisi method ke bahar.Har object ke liye
//        inn variables ki alag alag copy banti hai.playerName,playerSpeed,playerAge yeh sab instance variables hai.

//         LOCAL VARIABLES: yeh variables kisi method,constructor,ya block ke andar declare kiye jate hain.inka scope sirf usi block tak semmit rehta hai.
//        name,speed,age constructor ke local variables hain,aur speed playerRun method ka locls variable hai.

public class MyScopeExample{//--------------------------------------------------------------------------------------------
    static String root="I am availabale to all lines of code within my context ";  //                                     |
    public static void main(String[]args) {   //----------------------------------------------------                      |                                                      |
        String spy = "I am a spy"; //                                                               |                     |
        System.out.println(root); //ok                                                              | LOCAL               |
        System.out.println(spy); //ok                                                               | SCOPE               |
       // System.out.println(anotherSpy); //Error                                                     |                     |
    }//---------------------------------------------------------------------------------------------                      | GLOBAL SCOPE
        public static void helpfulFunction(){//--------------------------------                                           |
            String anotherSpy ="I am another spy";            //               |                                          |
            System.out.println(root); //ok                                     |  LOCAL                                   |
            System.out.println(anotherSpy); //ok                               |  SCOPE                                   |
          //  System.out.println(spy); //Error                                   |                                          |
    }//-------------------------------------------------------------------------                                          |
}//------------------------------------------------------------------------------------------------------------------------





















