package Factory;

public class OrderPizza {


    public static void main(String[] args) {
        Pizza pizza = PizzaFactory.getInstance("veg");
        System.out.println(pizza.bake());
        System.out.println(pizza.prepare());
        System.out.println(pizza.order());
    }

}
