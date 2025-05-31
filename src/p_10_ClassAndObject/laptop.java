public class laptop {
    String brand;
    int price;

    //Constructor---jab bhi new Laptop banega,ye chalega
    laptop(String brandName,int priceValue){
       //this ka matlab current object
        this.brand=brandName;
        this.price=priceValue;
    }
    //Method to show Laptop details
    void detail(){
        System.out.println("Laptop brand: "+brand);
        System.out.println("Laptop price: "+price+" Rs");
    }
}
