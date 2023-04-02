package FacadeDesignPattern;

public class OrderFacade {

    public void processOrder(String name, int quantity) {
        OrderProcessor processor = new OrderProcessor();
        if(processor.checkStock(name)){
            int orderId = processor.placeOrder(name,quantity);
            processor.shipOrder(orderId);
        }

    }
    
    public void placeOrder() {
        System.out.println("Order Placed");
    }

    public void shipOrder() {
        System.out.println("Order Shipped");

    }
}
