public class Drive {
    static int minAge =18;   //static variable
    String name;      // instance variable
    String dateOflicense;
    int age;        // instance variable
    public boolean isAllowed(){
        return this.age >= minAge;
    }
    public static void main(String[] args) {
//        Car myCar = new Car();
//        myCar.drive();   // initial fuel
//        myCar.addFuel(6); // add 6 litre fuel
//        myCar.drive();  // -1 litre (6-1 = 5)
//        myCar.drive();  // again -1 litre(5-1 = 4)
//        myCar.drive();  // now fuel 4 litre and Please Refule
//        System.out.println(myCar.getCurrentFuelLevel());

//        Car Audi = new Car();
//        Audi.addFuel(6);
//        Audi.start();
//        Audi.drive();

        Car Audi = new Car();
        Audi.addFuel(8).start().drive().getCurrentFuelLevel().Break().speed(400).sawspeed().speed(70).sawspeed();

        Drive myDriver = new Drive();
        myDriver.name = "Michel";
        System.out.println(myDriver.name);
        System.out.println(Drive.minAge);
        myDriver.age = 12;
        System.out.println(myDriver.isAllowed());
    }
}





