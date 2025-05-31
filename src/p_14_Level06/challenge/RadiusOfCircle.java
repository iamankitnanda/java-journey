package p_14_Level06.challenge;
import java.util.Scanner;
public class RadiusOfCircle {
        double radiusCircle;
        RadiusOfCircle(double  radiusCircle){
        this. radiusCircle= radiusCircle;
    }
    double getCircumference(){
            return 2* radiusCircle* Math.PI;
    }
    double getArea(){
            return Math.PI*Math.pow( radiusCircle,2);
    }

    @Override
    public String toString() {
        return "Circle props: Radius in mm:  "+ radiusCircle
                +", Circumferernce in mm:  "+getCircumference()
                +", Area in m2:  "+ getArea();
    }
    public static void main(String []args){
            Scanner sc=new Scanner(System.in);
            System.out.println("Please Enter thr radius: ");
            double radius=sc.nextInt();
        RadiusOfCircle circle=new RadiusOfCircle(radius);
        System.out.println(circle);
    }
}

