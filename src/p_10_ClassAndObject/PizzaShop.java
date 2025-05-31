//*Static vs Non-Static
//Example- Ek pizza shop hai,jiska contact number sab coustmers ke liye same hai(static),Aur har cpoustmer ka order number alag hota hai(Non-static)
public class PizzaShop {
   public static String contactNumber ="1800-123-PIZZA"; //static --sabka same
    int orderNumber; //Non-static ------> har object ka alag

    public void placeOrder(int number){
        orderNumber=number;
        System.out.println("Order placed! OrderNO- "+orderNumber);
    }
    public static void callShop(){
        System.out.println("Call us at "+contactNumber);
    }
}

