package FacadeDesignPattern;

import java.util.Random;

public class OrderProcessor {

    public boolean checkStock(String name) {
        System.out.println("Stock checked");
        return true;

    }

    public int placeOrder(String name, int quantity) {
        System.out.println("Order Placed with name " + name + " quantity " + quantity);
        return new Random().nextInt();
    }

    public void shipOrder(int orderId) {
        System.out.println("Order with ID : " + orderId + " Shipped");

    }
}
