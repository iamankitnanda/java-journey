public class Shop {
    public static void main(String[]args){
     PizzaShop.callShop(); //static method , direct class se call

        PizzaShop coustmer1=new PizzaShop();
        coustmer1.placeOrder(10);//non static,object se call

        PizzaShop coustmer2=new PizzaShop();
        coustmer2.placeOrder(15); // doosra object,doosra order no.

        PizzaShop.callShop();
    }
}
