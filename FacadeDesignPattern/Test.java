package FacadeDesignPattern;

public class Test {

    public static void main(String[] args) {
        OrderFacade facade = new OrderFacade();

        facade.processOrder("television",1);

    }
}
