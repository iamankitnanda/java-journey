package p_14_Level06;
public class FinalKeyword {
   final double PI=3.14;
    void testing(){
       // PI=44; //cannot reassign final variables
     //   System.out.println(PI);
    }
    public static void main(String[]args){
        FinalKeyword obj=new FinalKeyword();
        obj.testing();
    }
}
