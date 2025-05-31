package in.kgcoding;

public class AccessTest { 
    public static void main(String[]args){
        Car car=new Car();
        car.color="Red";
        car.model="ninja";
        System.out.println(car);
        car.costOfPurchase= 12222;   //private(isiliye idhar use nhi ho sakta)
        Car newCar=new Car("Black","BmW",1,50000);
        System.out.println(newCar);


        Default def=new Default();
    }
}
