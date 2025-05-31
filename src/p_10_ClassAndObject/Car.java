import java.util.Scanner;
public class Car {
        int nOfWheels;

        String color;

        float maxSpeed = 30;

        float currentFuleInLiters;

        int noOfSeats;

        public Car start(){
            if(currentFuleInLiters == 0){
                System.out.println("Car is out of Fuel, cant Start");
            }else if(currentFuleInLiters < 5){
                System.out.println("please Refule");
            }else {
                System.out.println("Car is started.......Bruhh.......");
            }
            return this; //This keyword
        }
        public Car drive(){
                currentFuleInLiters--;
            System.out.println("Car is Driving");
            return this;
        }
        public Car addFuel(float  currentFuleInLiters){
           this.currentFuleInLiters +=currentFuleInLiters;
            return this;
        }
        public Car getCurrentFuelLevel(){
            System.out.println(currentFuleInLiters);
            return this;
        }
        public Car Break(){
            System.out.println("Oye,Rukk ja Oye......");
            return this;
        }
        public Car speed(float maxSpeed){
            System.out.println("Meter khich "+maxSpeed+"Km/hr");
            System.out.println("SUiiiiiiiiiiiiii......yooooo");
            this.maxSpeed+=maxSpeed;
            return this;
        }
        public Car sawspeed(){
            System.out.println(maxSpeed+"Km/hr");
            return this;
        }
}
