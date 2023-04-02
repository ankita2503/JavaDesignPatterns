package DecoratorPattern;

public class PlainPizza implements Pizza{
    @Override
    public void bake() {
        System.out.println("Baking a Normal Pizza");
    }
}
