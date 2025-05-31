package in.kgcoding;

public class Car {
    public String color;

    public String model;

    private double fuelLevel;              // isko private rkhna hai

     long costOfPurchase;         // isko bhi private

    public Car(){

    } 
    public Car(String color, String model, double fuelLevel, long costOfPurchase) {
        this.color = color;
        this.model = model;
        this.fuelLevel = fuelLevel;        //class ke nadr accsess ho sakta hai
        this.costOfPurchase = costOfPurchase;   // class ke nadr accsess ho sakta hai
    }
    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", fuelLevel=" + fuelLevel +
                ", costOfPurchase=" + costOfPurchase +
                '}';
    }
}
