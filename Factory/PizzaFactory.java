package Factory;

public class PizzaFactory {

    public static Pizza getInstance(String type) {
        if (type == "cheese") {
            return new CheesePizza();
        }
        if (type == "veg") {
            return new VegPizza();
        }
        return null;
    }


}
